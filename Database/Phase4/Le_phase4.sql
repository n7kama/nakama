@"C:\Users\metal\Documents\Database\Phase3\Le_schema.sql"
@"C:\Users\metal\Documents\Database\Phase3\Le_Inserts.sql"

/* Question 1*/
SELECT PatName
FROM Patient, Physician, Bed
WHERE BedNum = BedNumber 
AND PhysID = PhysicianID
AND PhysicianID = 1 
AND Unit = 'Intensive Care Unit';

/* Question 2*/
SELECT Room
FROM Bed, Patient, Nurse
WHERE BedNum = Patient.BedNumber
AND NurseID = NurseIDFK
AND PatName LIKE NurseName;

/* Question 3*/
SELECT NurseName
FROM Nurse
WHERE SupervisorID = 101;

/* Question 4*/
SELECT PhysName, Specialty, TimecardHour
FROM Physician, Timecard
WHERE PhysID = PhysicianID;

/* Question 5*/
SELECT PatName
FROM Patient, Bed, Nurse
WHERE BedNum = Patient.BedNumber
AND NurseID = NurseIDFK
GROUP BY PatName;

/* Question 6*/
SELECT PatName
FROM Patient INNER JOIN Bed
ON Patient.BedNumber = BedNum
AND NurseIDFK IS NULL;

/* Question 7*/
SELECT Unit, AVG(Salary)
FROM Bed INNER JOIN Nurse
ON NurseID = NurseIDFK
GROUP BY Unit;

/* Question 8*/
SELECT AVG(TimecardHour)
FROM Physician INNER JOIN Timecard
ON  Timecard.PhysicianID = PhysID
WHERE Specialty = 'general practice';

/* Question 9*/
SELECT PhysName
FROM Physician  LEFT OUTER JOIN Timecard
ON  Timecard.PhysicianID = PhysID
WHERE(Timecard.PhysicianID) IS NULL ;

/* Question 10*/
SELECT AVG(Salary)
FROM Nurse INNER JOIN Bed
ON NurseID = NurseIDFK
GROUP BY Salary
HAVING COUNT(NurseID) = 2;

/* Question 11*/
SELECT Nursename, COUNT(NurseIDFK)
FROM Nurse INNER JOIN BED
ON NurseID = NurseIDFK
WHERE Salary > 70000
GROUP BY NurseName;

/* Question 12*/
SELECT N.NurseName
FROM Nurse N, Nurse Supervisor
WHERE N.NurseID = Supervisor.SupervisorID
AND Supervisor.salary > 90000;


/* Question 13*/
SELECT Specialty, SUM(TimecardHour), COUNT(PhysicianID)
FROM Physician, Timecard
WHERE PhysID = PhysicianID
GROUP BY Specialty;

/* Question 14 */
