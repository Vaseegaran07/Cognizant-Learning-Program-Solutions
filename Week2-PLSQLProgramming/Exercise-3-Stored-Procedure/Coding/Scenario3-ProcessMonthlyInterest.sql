--Scenario 1 : ProcessMonthlyInterest

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  UPDATE ACCOUNTS
  SET Balance = Balance + (Balance * 0.01)
  WHERE AccountType = 'Savings';

  COMMIT;
END;
/

BEGIN
  ProcessMonthlyInterest;
END;
/

SELECT * FROM ACCOUNTS;

