set serveroutput on;
create or replace trigger updateonstudent
before update or delete on student
for each row
begin
    insert into log_student values(CURRENT_TIMESTAMP,:OLD.STUDENTID,:OLD.NAME,:OLD.FATHERNAME,:OLD.MOTHERNAME,:OLD.GENDER,:OLD.MOBILENUMBER,:OLD.BRANCHNAME,:OLD.ADDRESS);
end;
/
