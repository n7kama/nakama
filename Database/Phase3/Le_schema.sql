DROP TABLE OrderTest;
DROP TABLE Timecard;
DROP TABLE Patient;
DROP TABLE Bed;
DROP TABLE Nurse;
DROP TABLE Physician;
DROP TABLE Test1;


CREATE TABLE Physician(
    PhysID NUMBER(5),
    PhysName VARCHAR(30),
    Specialty VARCHAR(20),
    CONSTRAINT PhysicianPK PRIMARY KEY (PhysID)
);

CREATE TABLE Test1(
    TestNum CHAR(3),
    TestName VARCHAR(20),
    
    CONSTRAINT TestPK PRIMARY KEY (TestNum, TestName)
);
CREATE TABLE Nurse(
    NurseID CHAR(3),
    NurseName VARCHAR(30),
    SupervisorID CHAR(3),
    Salary NUMBER(7),
    
    CONSTRAINT NursePK PRIMARY KEY (NurseID),
    CONSTRAINT NurseSupID FOREIGN KEY (NurseID)
        REFERENCES Nurse(NurseID)
);

CREATE TABLE Bed(
    BedNum CHAR(3),
    Room NUMBER(2),
    Unit VARCHAR(20),
    NurseIDFK CHAR(3),
    
    CONSTRAINT BedPK PRIMARY KEY (BedNum),
    CONSTRAINT NurseFK FOREIGN KEY (NurseIDFK)
        REFERENCES Nurse(NurseID)
    
);

CREATE TABLE Patient(
    PatID CHAR(4),
    PatName VARCHAR(20),
    PhysicianID NUMBER(5),
    BedNumber CHAR(3),
    
    CONSTRAINT PatPK PRIMARY KEY (PatID),
    CONSTRAINT Phys1FK FOREIGN KEY (PhysicianID)
        REFERENCES Physician(PhysID),
    CONSTRAINT Bed2FK FOREIGN KEY (BedNumber)
        REFERENCES Bed(BedNum)
);



CREATE TABLE Timecard(
    TimecardDate VARCHAR(10),
    TimecardHour VARCHAR(2),
    PhysicianID NUMBER(5),
    
    CONSTRAINT TimecardPK PRIMARY KEY (TimecardDate),
    CONSTRAINT Phys2FK FOREIGN KEY (PhysicianID)
        REFERENCES Physician(PhysID)
);

CREATE TABLE OrderTest(
    OrderResult VARCHAR(4),
    OrderDate VARCHAR(10),
    OrderTime VARCHAR(7),
    PhysicianID NUMBER(5),
    PatientID CHAR(4),
    TestNumber CHAR(3),
    TestName VARCHAR(20),
    
   
    CONSTRAINT Phys3FK FOREIGN KEY (PhysicianID)
        REFERENCES Physician(PhysID),
    CONSTRAINT PatientFK FOREIGN KEY (PatientID)
        REFERENCES Patient(PatID),
    CONSTRAINT TestFK FOREIGN KEY (TestNumber, TestName)
        REFERENCES Test1(TestNum, TestName)
    
);
