@"C:\Users\metal\Documents\Database\Phase3\Le_schema.sql"
@"C:\Users\metal\Documents\Database\Phase3\Le_Inserts.sql"


SELECT NurseName
FROM Nurse
WHERE Salary > 70000;

SELECT Specialty
FROM Physician
WHERE Specialty LIKE 'general practice';

SELECT Specialty
FROM Physician
WHERE Specialty LIKE '%medicine';

SELECT Specialty
FROM Physician
WHERE Specialty IS NULL;

SELECT NurseName
FROM Nurse
WHERE Salary BETWEEN 70000 AND 80000;

SELECT PhysName
FROM Physician
WHERE Specialty LIKE '%ology';

SELECT MIN(Salary) as minSalary, MAX(Salary) as maxSalary
FROM Nurse;

SELECT AVG(Salary)
FROM Nurse;