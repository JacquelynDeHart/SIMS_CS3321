/*FILE OF SUBQUERIES NOT TO BE USED ONLY USED TO CREATE TABLES OF DATABASE*/

create table admins(
adminID int, adminName text PRIMARY KEY(adminID));

create table students(
studentID int, studentName text, GPA dec PRIMARY KEY(studentID));

create table class(
classID int, className text PRIMARY KEY(cLassID));

create table grades(
studentID int, classID int, grade int, points int);
