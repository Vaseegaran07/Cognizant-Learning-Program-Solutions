CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
  p_Department IN VARCHAR2,
  p_BonusPct IN NUMBER
) IS
BEGIN
  UPDATE EMPLOYEES
  SET Salary = Salary + (Salary * (p_BonusPct / 100))
  WHERE Department = p_Department;

  COMMIT;
END;
/

BEGIN
  UpdateEmployeeBonus('Sales', 10);
END;
/

SELECT * FROM EMPLOYEES;
