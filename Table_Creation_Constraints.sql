drop table login_log_student;

drop table login_log_librarian;

drop table Log_Student;

drop table Log_Librarian;

drop table Log_Book;

drop table student_credentials;

drop table librarian_credentials;

drop table issue;

drop table book;

drop table librarian;

drop table student;

CREATE TABLE Student(
StudentID varchar(10),
Name varchar(30),
FatherName varchar(30),
MotherName Varchar(30),
Gender varchar(1),
MobileNumber varchar(10),
BranchName varchar(10),
Address varchar(50)
);


CREATE TABLE Book(
BookID varchar(10),
Name varchar(100),
Author varchar(100),
Publisher Varchar(100),
Price varchar(10),
PublishedYear varchar(5),
Capacity varchar(10)
);


CREATE TABLE Issue(
BookID varchar(10),
StudentID varchar(10),
IssuedDate varchar(20),
DueDate varchar(20),
ReturnedDate varchar(20)
);

create table Librarian(
LibrarianID varchar(10),
Name varchar(30),
Gender varchar(1),
MobileNumber varchar(10),
Address varchar(50)
);

create table student_credentials(
StudentID varchar(10),
Password varchar(100) not null,
salt varchar(20) not null
);

create table librarian_credentials(
LibrarianID varchar(10),
Password varchar(100) not null,
salt varchar(20) not null
);

CREATE TABLE Log_Student(
dateofupdate timestamp,
StudentID varchar(10),
Name varchar(30),
FatherName varchar(30),
MotherName Varchar(30),
Gender varchar(1),
MobileNumber varchar(10),
BranchName varchar(10),
Address varchar(50)
);

create table Log_Librarian(
dateofupdate timestamp,
LibrarianID varchar(10),
Name varchar(30),
Gender varchar(1),
MobileNumber varchar(10),
Address varchar(50)
);

CREATE TABLE Log_Book(
dateofupdate timestamp,
BookID varchar(10),
Name varchar(100),
Author varchar(100),
Publisher Varchar(100),
Price varchar(10),
PublishedYear varchar(5),
Capacity varchar(10)
);

create table login_log_student(
    log_id number GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1),
    StudentID varchar(10),
    Log_Date date,
    Log_Time timestamp
);

create table login_log_librarian(
    log_id number GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1),
    LibrarianID varchar(10),
    Log_Date date,
    Log_Time timestamp
);

alter table student add constraint PK_STUDENTID PRIMARY KEY(StudentID);

alter table book add constraint PK_BOOKID PRIMARY KEY(BookID);

alter table issue add constraint FK_BOOKID FOREIGN KEY(BookID) references book(BookID) ON DELETE CASCADE;

alter table issue add constraint FK_STUDENTID FOREIGN KEY(StudentID) references student(StudentID) ON DELETE CASCADE;

alter table issue add constraint PK_BOOKID_STUDENTID_ISSUEDDATE PRIMARY KEY(BookID,StudentID,IssuedDate);

alter table librarian add constraint PK_LIBRARIANID PRIMARY KEY(LibrarianID);

alter table student_credentials add constraint FK_STUDENTID_CREDENTIALS FOREIGN KEY(StudentID) references student(StudentID) ON DELETE CASCADE;

alter table librarian_credentials add constraint FK_LIBRARIANID_CREDENTIALS FOREIGN KEY(LibrarianID) references Librarian(LibrarianID) ON DELETE CASCADE;

alter table student_credentials add constraint PK_STUDENTID_CREDENTIALS PRIMARY KEY(StudentID);

alter table librarian_credentials add constraint PK_LIBRARIANID_CREDENTIALS PRIMARY KEY(LibrarianID);

alter table login_log_student add constraint FK_STUDENTID_LOGIN FOREIGN KEY(StudentID) references Student(StudentID) ON DELETE CASCADE;

alter table login_log_student add constraint PK_LOGIN_STUDENT PRIMARY KEY(log_id);

alter table login_log_librarian add constraint FK_LIBRARIAN_LOGIN FOREIGN KEY(LibrarianID) references Librarian(LibrarianID) ON DELETE CASCADE;

alter table login_log_librarian add constraint PK_LOGIN_LIBRARIAN PRIMARY KEY(log_id);

alter table Log_Student add constraint PK_LOG_STUDENT PRIMARY KEY(dateofupdate);

alter table Log_Librarian add constraint PK_LOG_LIBRARIAN PRIMARY KEY(dateofupdate);

alter table Log_Book add constraint PK_LOG_BOOK PRIMARY KEY(dateofupdate);