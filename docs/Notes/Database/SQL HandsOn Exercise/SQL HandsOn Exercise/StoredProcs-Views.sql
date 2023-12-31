USE [MDTrainingNov]
GO
/****** Object:  StoredProcedure [dbo].[GetEmpDetails]    Script Date: 11/16/2021 5:18:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create procedure [dbo].[GetEmpDetails]
@empid smallint
as
begin
		select a.empid, a.empname, 
			   b.projectid, b.clientid     
		from employee a join empproject b on a.empid = b.empid
		where a.empid = @empid
end



/****************************************************************************************/


GO
/****** Object:  StoredProcedure [dbo].[GetEmpDetailsBySal]    Script Date: 11/16/2021 5:19:13 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- exec GetEmpDetailsBySal 1000, 8000
Create procedure [dbo].[GetEmpDetailsBySal]
@empsalstrt smallint,
@empsalend  smallint
as
begin
     create table #result
	 (
	      empid smallint, empname varchar(100), empproject varchar(100), client varchar(100), salary smallint
	 )
	 	 
    --if exists (select d.empid from empsalary d where d.salary >=8000)
		begin

		        insert into #result
					select a.empid, a.empname, 
							b.projectid, b.clientid , c.salary   
					from employee a join empproject b on a.empid = b.empid
									join empsalary c on a.empid = c.empid
					where c.salary between @empsalstrt and @empsalend
		end

		select * from #result
	--else
	--    begin
	--	      Select 'No Records'
	--	end

end





-- exec GetEmpDetails
-- exec GetEmpDetails 5000
alter procedure dbo.GetEmpDetails
( @sal int,
  @startdate int)
as 
begin

	select a.empid, 
		   a.empname, 
		   b.projectid,
		   b.startyear,
		   b.endyear, 
		   d.salary
		   from employee a join empproject b on a.empid = b.empid 
						   join empdept c on a.department = c.deptid
						   join empsalary d on a.empid = d.empid 
						  where d.salary >= @sal and b.startyear = @startdate

end



/*************************** VIEWS *******************************************/

SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

create view [dbo].[VWEmpClientProject]
as
select  a.empid, a.empname, 
	    b.projectid, b.clientid , c.salary   
		from employee a join empproject b on a.empid = b.empid
					    join empsalary c on a.empid = c.empid
GO