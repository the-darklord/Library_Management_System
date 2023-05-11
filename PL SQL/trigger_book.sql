set serveroutput on;
create or replace trigger updateonbook
before update or delete on book
for each row
begin
    insert into log_book values(CURRENT_TIMESTAMP,:OLD.BOOKID,:OLD.NAME,:OLD.AUTHOR,:OLD.PUBLISHER,:OLD.PRICE,:OLD.PUBLISHEDYEAR,:OLD.CAPACITY);
end;
/
