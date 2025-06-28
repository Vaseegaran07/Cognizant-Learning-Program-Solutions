CREATE OR REPLACE PROCEDURE TransferFunds(
  p_SourceAccountID IN NUMBER,
  p_TargetAccountID IN NUMBER,
  p_Amount IN NUMBER
) IS
  v_SourceBalance NUMBER;
BEGIN
  SELECT Balance INTO v_SourceBalance
  FROM ACCOUNTS
  WHERE AccountID = p_SourceAccountID;

  IF v_SourceBalance >= p_Amount THEN
    UPDATE ACCOUNTS
    SET Balance = Balance - p_Amount
    WHERE AccountID = p_SourceAccountID;

    UPDATE ACCOUNTS
    SET Balance = Balance + p_Amount
    WHERE AccountID = p_TargetAccountID;

    COMMIT;
  ELSE
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in source account.');
  END IF;
END;
/

BEGIN
  TransferFunds(1, 2, 200);
END;
/

SELECT * FROM ACCOUNTS;
