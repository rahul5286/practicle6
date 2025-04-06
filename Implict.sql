Create TABLE customer 
(id number(3),
Name varchar2(20),
Age number(2),
Address varchar2(20),
Salary number(7)
);

declare
	c customer%ROWTYPE;
begin
	c.id:=&customer_id;
	c.Name:=&customer_Name;
	c.Age:=&customer_Age;
	c.Address:=&customer_Address;
	c.Salary:=&customer_Salary;
	
	insert into customer values(c.id,c.Name,c.Age,c.Address,c.Salary);
	
	dbms_output.put_line("Data Insert ");
end;
/