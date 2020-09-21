
drop database if exists  project;

create database project;
use project;

create table user_role (
	user_id int not null,
    role_id int not null
);

create table _user (
	user_id int primary key auto_increment,
    username varchar(25) not null,
    pass_word varchar (16) not null,
    full_name varchar(50) not null,
    email varchar(55) not null,
    address varchar(255) not null,
    phone_number varchar(15) not null,
    avatar varchar(255)
);

create table _role (
	role_id int primary key auto_increment,
    role_name varchar(50)
);

insert into _role(role_name) values ('ROLE_ADMIN');
insert into _role(role_name) values ('ROLE_MEMBER');

alter table user_role
add constraint primary key(user_id, role_id),
add constraint user_id foreign key (user_id) references _user(user_id),
add constraint role_id foreign key (role_id) references _role(role_id);

create table _subject(
subject_id int,
subject_name varchar(225),
primary key (subject_id));

CREATE TABLE test (
  test_id INT primary key auto_increment,
  test_code VARCHAR(50) NOT NULL,
  test_name VARCHAR(50) NOT NULL,
  grade VARCHAR(50) NOT NULL,
  subject_id INT NOT NULL,
  FOREIGN KEY (subject_id) REFERENCES _subject (subject_id)
);

create table question(
question_id varchar(225),
answer varchar(225),
right_answer varchar(225),
subject_id int,
primary key (question_id),
foreign key (subject_id) references _subject(subject_id)
);

CREATE TABLE Test_Question(
    test_id INT NOT NULL,
    question_id varchar(255) NOT NULL,
    FOREIGN KEY (test_id) REFERENCES test (test_id),
    FOREIGN KEY (question_id) REFERENCES question (question_id),
    primary key (test_id,question_id)
);

-- PHUONG
CREATE table Exam(
	exam_id int primary key ,
    user_id int not null,
    test_id int not null,
    exam_date date not null,
    mark double not null,
    answer VARCHAR(255),
    FOREIGN KEY (user_id) REFERENCES _user (user_id),
    FOREIGN KEY (test_id) REFERENCES test(test_id));
    
    