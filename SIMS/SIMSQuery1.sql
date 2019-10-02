create table admins(
adminID int, adminName text PRIMARY KEY(adminID));

create table students(
studentID int, studentName text, GPA dec PRIMARY KEY(studentID));

create table class(
classID int, className text PRIMARY KEY(cLassID));

create table grades(
studentID int, classID int, grade int);

insert into admins(adminID, adminName)
values
(1000, 'Jaquelyn'), (1001, 'John');

insert into students(studentID, studentName)
values
(2000, 'Andrew'), (2001, 'Julio');

insert into class(classID, className)
values
(3304, 'Data Structures'), (2410, 'CS 2'), (4310, 'Operating Systems');

insert into grades(studentID, classID, grade)
values
(2000, 3304, 80), (2000, 2410, 90), (2000, 4310, 100), (2001, 3301, 90), (2001,2410, 100), (2001, 4310, 80);

insert into students(GPA)
select avg(grade)
from grades
where studentID = 2000;
