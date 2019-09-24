create table sims(
student_id INT, student_name TEXT PRIMARY KEY(student_id));

create table classes(
student_id INT, class TEXT, grade TEXT, gpa DECIMAL PRIMARY KEY(student_id));

select s.student_name, c.class, c. grade, c.gpa from sims s left join classes c on s.student_id = c.student_id

insert into sims (student_id, student_name) values (1, 'Andrew'); 

insert into classes (class, grade) values ('OS', 'A');