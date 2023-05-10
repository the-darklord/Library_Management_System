set serveroutput on;
declare
due_d issue.duedate%TYPE;
return_d issue.returneddate%TYPE;
return_s varchar(20) := 'YES';
begin
    due_d := '&Due_Date';
    return_d := '&Return_Date';
    dbms_output.put_line('Fine is Rs.'||fines(due_d,return_d));
end;
/