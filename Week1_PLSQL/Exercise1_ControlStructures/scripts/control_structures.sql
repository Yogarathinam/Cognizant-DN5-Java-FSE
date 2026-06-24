-- Creating tables
CREATE TABLE Customers (
                           CustomerID INT PRIMARY KEY,
                           Name VARCHAR(50),
                           DOB DATE,
                           Balance DECIMAL(10,2),
                           IsVIP VARCHAR(10) DEFAULT 'FALSE'
);

CREATE TABLE Loans (
                       LoanID INT PRIMARY KEY,
                       CustomerID INT,
                       InterestRate DECIMAL(5,2),
                       DueDate DATE,
                       FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

-- Adding some dummy test data
INSERT INTO Customers VALUES (1, 'John Doe', TO_DATE('1955-05-12', 'YYYY-MM-DD'), 12000.00, 'FALSE');
INSERT INTO Customers VALUES (2, 'Jane Smith', TO_DATE('1988-09-25', 'YYYY-MM-DD'), 5000.00, 'FALSE');
INSERT INTO Customers VALUES (3, 'Bob Martin', TO_DATE('1960-01-01', 'YYYY-MM-DD'), 25000.00, 'FALSE');

INSERT INTO Loans VALUES (101, 1, 7.5, SYSDATE + 15);
INSERT INTO Loans VALUES (102, 2, 8.0, SYSDATE + 45);
INSERT INTO Loans VALUES (103, 3, 6.5, SYSDATE + 10);
COMMIT;


-- Scenario 1: Interest rate discount for senior citizens (over 60)
DECLARE
CURSOR senior_cursor IS
SELECT l.LoanID, l.InterestRate
FROM Loans l
         JOIN Customers c ON l.CustomerID = c.CustomerID
WHERE (SYSDATE - c.DOB) / 365 > 60;
BEGIN
FOR row IN senior_cursor LOOP
UPDATE Loans
SET InterestRate = InterestRate - 1
WHERE LoanID = row.LoanID;
END LOOP;
COMMIT;
END;
/


-- Scenario 2: Promote high balance accounts to VIP status
DECLARE
CURSOR balance_cursor IS
SELECT CustomerID
FROM Customers
WHERE Balance > 10000;
BEGIN
FOR row IN balance_cursor LOOP
UPDATE Customers
SET IsVIP = 'TRUE'
WHERE CustomerID = row.CustomerID;
END LOOP;
COMMIT;
END;
/


-- Scenario 3: Reminder for loans due in next 30 days
SET SERVEROUTPUT ON;
DECLARE
CURSOR due_cursor IS
SELECT c.Name, l.LoanID, l.DueDate
FROM Loans l
         JOIN Customers c ON l.CustomerID = c.CustomerID
WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
FOR row IN due_cursor LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Customer ' || row.Name ||
                             ' has loan ID ' || row.LoanID ||
                             ' due on ' || TO_CHAR(row.DueDate, 'YYYY-MM-DD'));
END LOOP;
END;
/