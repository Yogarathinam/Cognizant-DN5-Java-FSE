-- Making simple test tables
CREATE TABLE Accounts (
                          AccountID INT PRIMARY KEY,
                          AccountType VARCHAR(20),
                          Balance DECIMAL(10,2)
);

CREATE TABLE Employees (
                           EmployeeID INT PRIMARY KEY,
                           Name VARCHAR(50),
                           Department VARCHAR(50),
                           Salary DECIMAL(10,2)
);

-- Quick mock data to test out the logic
INSERT INTO Accounts VALUES (101, 'Savings', 5000.00);
INSERT INTO Accounts VALUES (102, 'Current', 2000.00);
INSERT INTO Accounts VALUES (103, 'Savings', 10000.00);

INSERT INTO Employees VALUES (1, 'Arun', 'IT', 60000.00);
INSERT INTO Employees VALUES (2, 'Divya', 'IT', 65000.00);
INSERT INTO Employees VALUES (3, 'Vijay', 'HR', 45000.00);
COMMIT;


-- Scenario 1: Process monthly interest (1%) for savings accounts
CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
UPDATE Accounts
SET Balance = Balance + (Balance * 0.01)
WHERE AccountType = 'Savings';
END;
//


-- Scenario 2: Give department-wise salary bonus based on input parameters
CREATE PROCEDURE UpdateEmployeeBonus(
    IN dept_name VARCHAR(50),
    IN bonus_percent DECIMAL(5,2)
)
BEGIN
UPDATE Employees
SET Salary = Salary + (Salary * (bonus_percent / 100))
WHERE Department = dept_name;
END;
//


-- Scenario 3: Bank fund transfer between accounts with a balance check
CREATE PROCEDURE TransferFunds(
    IN from_id INT,
    IN to_id INT,
    IN transfer_amount DECIMAL(10,2)
)
BEGIN
    DECLARE source_balance DECIMAL(10,2);

    -- Grab current balance of sender
SELECT Balance INTO source_balance FROM Accounts WHERE AccountID = from_id;

-- Only move cash if they actually have enough
IF source_balance >= transfer_amount THEN
UPDATE Accounts SET Balance = Balance - transfer_amount WHERE AccountID = from_id;
UPDATE Accounts SET Balance = Balance + transfer_amount WHERE AccountID = to_id;
END IF;
END;
//