@"C:\Users\metal\Documents\Database\Phase3\Le_schema.sql"
@"C:\Users\metal\Documents\Database\Phase3\Le_Inserts.sql"

DECLARE
    NurseSalary NUMBER;
    
BEGIN
    SELECT AVG (Salary) INTO NurseSalary FROM Nurse;
    DBMS_OUTPUT.PUT_LINE('Average Salary: ' || NurseSalary);
    
    SELECT MIN (Salary) INTO NurseSalary FROM Nurse;
    DBMS_OUTPUT.PUT_LINE('Min Salary: ' || NurseSalary);
    
    SELECT MAX (Salary) INTO NurseSalary FROM Nurse;
    DBMS_OUTPUT.PUT_LINE('Max Salary: ' || NurseSalary);
    
END;

/

DECLARE