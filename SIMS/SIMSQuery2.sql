/*USE THIS FILE OF SUB-QUERIES TO INSERT NEW VALUES*/

insert into admins(adminID, adminName)
values
(1000, 'Jaquelyn'), (1001, 'John');

insert into students(studentID, studentName)
values
(2000, 'Andrew'), (2001, 'Julio'), (2002, 'Ary');

insert into class(classID, className)
values
(3304, 'Data Structures'), (2410, 'CS 2'), (4310, 'Operating Systems');

insert into grades(studentID, classID, grade, points)
values
(2000, 3304, 'B-', 3.15), (2000, 2410, 'C+', 2.75), (2000, 4310, 'A+', 5), 
(2001, 3301, 'A', 4), (2001,2410, 'B+', 3.75), (2001, 4310, 'B', 3),
(2002, 3304, 'B', 3), (2002, 2410, 'B+', 3.75), (2002, 4310, 'B-', 3.15);