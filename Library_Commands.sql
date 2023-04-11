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

alter table student add constraint PK_STUDENTID PRIMARY KEY(StudentID);

alter table book add constraint PK_BOOKID PRIMARY KEY(BookID);

alter table issue add constraint FK_BOOKID FOREIGN KEY(BookID) references book(BookID) ON DELETE CASCADE;

alter table issue add constraint FK_STUDENTID FOREIGN KEY(StudentID) references student(StudentID) ON DELETE CASCADE;

alter table issue add constraint PK_BOOKID_STUDENTID PRIMARY KEY(BookID,StudentID);

alter table librarian add constraint PK_LIBRARIANID PRIMARY KEY(LibrarianID);

alter table student_credentials add constraint FK_STUDENTID_CREDENTIALS FOREIGN KEY(StudentID) references student(StudentID) ON DELETE CASCADE;

alter table librarian_credentials add constraint FK_LIBRARIANID_CREDENTIALS FOREIGN KEY(LibrarianID) references Librarian(LibrarianID) ON DELETE CASCADE;

alter table student_credentials add constraint PK_STUDENTID_CREDENTIALS PRIMARY KEY(StudentID);

alter table librarian_credentials add constraint PK_LIBRARIANID_CREDENTIALS PRIMARY KEY(LibrarianID);