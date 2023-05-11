set serveroutput on;
create or replace trigger updateonlibrarian
before update or delete on librarian
for each row
begin
    insert into log_librarian values(CURRENT_TIMESTAMP,:OLD.LIBRARIANID,:OLD.NAME,:OLD.GENDER,:OLD.MOBILENUMBER,:OLD.ADDRESS);
end;
/
