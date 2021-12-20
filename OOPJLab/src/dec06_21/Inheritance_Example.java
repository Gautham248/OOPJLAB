package dec06_21;

import java.util.*;
class Employee{
	String name,phone,address;
	int salary,age;
	 void Employ(String n,String p,String a,int s,int ag){
		name=n;phone=p;address=a;salary=s;age=ag;
	}
	void printSalary() {
		System.out.println(salary);
	}
}

class Officer extends Employee{
	String spl;
	void Office(String spla){
		spl=spla;
	}
}

class Manager extends Employee{
	String dept;
	void man(String mana) {
		dept=mana;
	}
}

public class Inheritance_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Employee e=new Employee();
		Officer o=new Officer();
		Manager m= new Manager();
		System.out.println("OFFICER DETAILS");
		System.out.print("Name           : ");String na=sc.nextLine();
		System.out.print("Phone          : ");String ph=sc.nextLine();
		System.out.print("Address        : ");String ad=sc.nextLine();
		System.out.print("Specialization : ");String sl=sc.nextLine();
		System.out.print("Salary         : ");int sa=sc.nextInt();
		System.out.print("Age            : ");int agee=sc.nextInt();
		o.Employ(na, ph, ad, sa, agee);
		o.Office(sl);
		System.out.println("\n");
		
		System.out.println("MANAGER DETAILS");
		System.out.print("Name           : ");String n1=sc.next();
		System.out.print("Phone          : ");String p1=sc.next();
		System.out.print("Address        : ");String a1=sc.next();
		System.out.print("Department     : ");String de=sc.next();
		System.out.print("Salary         : ");int s1=sc.nextInt();
		System.out.print("Age            : ");int ag1=sc.nextInt();
		
		m.Employ(n1, p1, a1, s1, ag1);
		m.man(de);
		System.out.println("\n\n");
	
		System.out.println("----DETAILS----\n");
		System.out.println("OFFICER DETAILS");
		System.out.println("Name           : "+o.name);
		System.out.println("Phone          : "+o.phone);
		System.out.println("Address        : "+o.address);
		System.out.println("Specialization : "+o.spl);
		System.out.print("Salary         : ");o.printSalary();
		System.out.println("Age            : "+o.age);
		System.out.println("\n");
		System.out.println("MANAGER DETAILS");
		System.out.println("Name           : "+m.name);
		System.out.println("Phone          : "+m.phone);
		System.out.println("Address        : "+m.address);
		System.out.println("Department     : "+m.dept);
		System.out.print("Salary         : ");m.printSalary();
		System.out.println("Age            : "+m.age);
	}

}
