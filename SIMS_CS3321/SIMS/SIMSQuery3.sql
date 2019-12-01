/*USE THIS FILE OF SUB-QUERIES TO CALCULATE GPA AND UPDATE VALUES*/

update students 
set GPA =
	(select avg(points) from grades where studentID = 2000)

where studentID = 2000;

		
update students
set GPA =
	(select avg(points) from grades where studentID = 2001)

where studentID = 2001;

update students
set GPA =
	(select avg(points) from grades where studentID = 2002)

where studentID = 2002;