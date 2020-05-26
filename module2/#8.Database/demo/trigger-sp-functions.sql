-- TRIGGER, NEW/OLD

delimiter //
create trigger dang_ky_james
after insert
-- /before insert/after update/before update....
on hoc_vien for each row
begin
-- process
--  declare pTen varchar(30);
--  select/set pTen = '321';
	insert into tai_khoan_james
    values (concat(lcase(new.ten_hoc_vien), 'abcxyz'), '12345678');
end;//
delimiter ;
-- Nguyen Vu Thanh Tien
-- tien.nguyen

drop trigger dang_ky_james;

INSERT INTO `codegym`.`hoc_vien` (`ten_hoc_vien`, `ngay_sinh`, `ten_tai_khoan`, `ma_lop`)
VALUES ('Thien', '1999-01-01', 'thien', '5');

-- STORED PROCEDURE
-- https://www.w3schools.com/sql/sql_stored_procedures.asp

-- FUNCTIONS

DELIMITER //
CREATE FUNCTION GETFULLNAME(fname CHAR(250),lname CHAR(250))
    RETURNS CHAR(250)
    BEGIN
        DECLARE fullname CHAR(250);
        SET fullname=CONCAT(fname,' ',lname);
        RETURN fullname;
    END //
DELIMITER ;