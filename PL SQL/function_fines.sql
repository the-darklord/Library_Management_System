set serveroutput on;
create or replace function fines(due_d varchar,return_d varchar)
return number as
dd date;
rd date;
days number;
fines number;
begin

    select to_date(due_d,'DD-MM-YYYY') into dd from dual;

    select to_date(sysdate,'DD-MON-YYYY') into rd from dual;

    if return_d <> '-' then
        select to_date(return_d,'DD-MON-YYYY') into rd from dual;
    end if;

    select trunc(rd-dd) into days from dual;

    if days between 0 and 7 then
        fines := days;
    elsif days between 8 and 14 then
        fines := 7 + 3*(days-7);
    elsif days>14 then
        fines := 7 + 3*7 + 5*(days-14);
    end if;
    
    return fines;
end;
/