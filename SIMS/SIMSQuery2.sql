/*USE THIS FILE OF SUB-QUERIES TO INSERT NEW VALUES*/

insert into admins(adminID, adminName)
values
(1000, 'Jaquelyn'), (1001, 'John');

insert into students(studentID, studentName)
values
(2000, 'Andrew'), (2001, 'Julio');

insert into class(classID, className)
values
(3304, 'Data Structures'), (2410, 'CS 2'), (4310, 'Operating Systems');

insert into grades(studentID, classID, grade, points)
values
(2000, 3304, 85, 3), (2000, 2410, 73, 2), (2000, 4310, 100, 4), (2001, 3301, 90, 4), (2001,2410, 100, 4), (2001, 4310, 80, 3);