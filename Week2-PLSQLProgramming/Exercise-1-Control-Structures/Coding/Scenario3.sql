-- Scenario 3: Send loan reminders

BEGIN
  FOR rec IN (
    SELECT L.LoanID, C.Name, L.DueDate
    FROM LOANS L JOIN CUSTOMERS C
    ON L.CustomerID = C.CustomerID
    WHERE L.DueDate <= SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE(
      'Reminder: Loan ID ' || rec.LoanID ||
      ' for customer ' || rec.Name ||
      ' is due on ' || TO_CHAR(rec.DueDate, 'DD-MON-YYYY')
    );
  END LOOP;
END;
/
SELECT * FROM CUSTOMERS;
SELECT * FROM LOANS;
