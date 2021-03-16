CREATE TABLE students(
   id SERIAL PRIMARY KEY,
   firstName VARCHAR,
   lastName VARCHAR,
   age INT,
   country VARCHAR,
   city VARCHAR,
   gender VARCHAR,
   email VARCHAR,
   password VARCHAR,
);

CREATE TABLE courses(
   id SERIAL PRIMARY KEY,
   name VARCHAR
);


CREATE TABLE enrollcourses(

   id SERIAL PRIMARY KEY,
   student_id int,
	course_id int
);



