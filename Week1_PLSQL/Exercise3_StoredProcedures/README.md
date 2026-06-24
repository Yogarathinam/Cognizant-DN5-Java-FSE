# Exercise 3: Stored Procedures

Stored procedures are saved database scripts used to automate common tasks and avoid repeating commands.

## Key Procedures:

- ProcessMonthlyInterest
  Adds a flat 1% interest rate.
  Important constraint: Only applies to 'Savings' accounts.

- UpdateEmployeeBonus
  Inputs required: department name and bonus multiplier.
  Automatically recalculates pay for all employees in the specified department.

- TransferFunds
  Safely moves money between accounts.
  Includes a strict balance check first to prevent negative balances.