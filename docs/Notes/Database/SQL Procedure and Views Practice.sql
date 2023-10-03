-- SQL Stored Procedures for SQL Server

-- 1. The following SQL statement creates a stored procedure
CREATE PROCEDURE ProcedureName1
AS
SELECT * FROM TableName
GO;


-- Execute the stored procedure above as follows:

EXEC ProcedureName1;



-- Stored Procedure With One Parameter

-- 2. The following SQL statement creates a stored procedure with One Parameter
CREATE PROCEDURE ProcedureName2 @Param1 nvarchar(30)
AS
SELECT * FROM TableName WHERE empname = @Param1
GO;


-- Execute the stored procedure above as follows:

EXEC ProcedureName2 @Param1 = 'Rahul';




-- SQL Views

-- 3. SQL CREATE OR REPLACE VIEW Syntax

CREATE OR REPLACE VIEW view_name AS
SELECT column1, column2, ...
FROM table_name
WHERE condition;


-- We can query the view above as follows:

SELECT * FROM view_name;





