create DATABASE student_management;
use student_management;

create table students(
  id int primary key,
  name varchar(100) not null,
  department varchar(100) not null,
  marks int not null,
  create_at timestamp default current_timestamp
);

drop table students;


select*from students;