-- Scenario 1 - Apply 1% interest discount if age > 60

BEGIN
  FOR rec IN (SELECT CustomerID FROM CUSTOMERS WHERE Age > 60) LOOP
    UPDATE LOANS
    SET InterestRate = InterestRate - 1
    WHERE CustomerID = rec.CustomerID;
  END LOOP;
  COMMIT;
END;
/

SELECT * FROM LOANS;
