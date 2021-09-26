/* 2. Create a class ‘Employee’ with data members Empid, Name, Salary, Address and 
constructors to initialize the data members. Create another class ‘Teacher’ that inherit the 
properties of class employee and contain its own data members department, Subjects taught 
and constructors to initialize these data members and also include display function to 
display all the data members. Use array of objects to display details of N teachers*/



import java.io.*;
class emp
	{
	int empid,salary;
	String ename,address;	
	
	emp(int empid, String ename, int salary,String address)
		{
		this.empid=empid;
		this.ename=ename;
		this.salary=salary;
		this.address=address;
		}
	
	}
class teacher extends emp
	{
	String dept,subj;
	teacher(int empid, String ename, int salary,String address,String dept,String subj)
		{
		super(empid,ename,salary, address);
		this.dept=dept;
		this.subj=subj;
		}
	void display()
		{
		System.out.println("\nEmployee details:");
		System.out.println("\nemp no:"+ empid);
		System.out.println("\nemp name:"+ ename);
		System.out.println("\nsalary:"+ salary);
		System.out.println("\naddress:"+ address);
		System.out.println("\ndepartment:"+ dept);
		System.out.println("\nsubject:"+ subj);
		}
	}
class inher
	{
	public static void main(String[] args)
		{
		teacher []t= new teacher[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int eno1=0,sal=0,i,n=0;
		String name,addr,dept,subj;
		try
			{
			System.out.println("enter no of employees:");
			n=Integer.parseInt(br.readLine());

			for(i=0;i<n;i++)
				{
				System.out.println("enter the empno,ename,salary,address,dept,subj:");
				eno1=Integer.parseInt(br.readLine());
				name=br.readLine();
				sal=Integer.parseInt(br.readLine());
				addr=br.readLine();
				dept=br.readLine();
				subj=br.readLine();
				t[i]=new teacher(eno1,name,sal,addr,dept,subj);				
				}		
			}
		catch(IOException e1)
			{System.out.println(e1);}
		for(i=0;i<n;i++)
			{
			t[i].display();
			}
		}
	}