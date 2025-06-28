--  Scenario 2: Promote VIP

BEGIN
  FOR rec IN (SELECT CustomerID FROM CUSTOMERS WHERE Balance > 10000) LOOP
    UPDATE CUSTOMERS
    SET IsVIP = 'Y'
    WHERE CustomerID = rec.CustomerID;
  END LOOP;
  COMMIT;
END;
/
SELECT * FROM CUSTOMERS;
