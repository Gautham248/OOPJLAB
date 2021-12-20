package dec13_21;
import java.util.*;
class employee{
	double base,dal,hra;double sum;
	//void employee(double a,double b,double c){
		//base=a;dal=b;har=c;
	//}
	void display() {
		System.out.println("--EMPLOYEE CLASS--");
	}
	void calcSalary() {
		
		sum=base+dal+hra;
		System.out.println("The Gross Salary of the Employee: "+sum);
	}
	
}
class engineer extends employee{
	void disp() {
		System.out.println("--ENGINEER CLASS--");
	}
	void esal() {
	System.out.println("The Gross Salary of the engineer: "+sum*2);
	}
	}


public class Employee_Engineer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		engineer e=new engineer();
		System.out.println("Enter the basic salary of the employee");
		e.base=sc.nextDouble();
		System.out.println("Enter the DA of the employee:");
		e.dal=sc.nextDouble();
		System.out.println("Enter the HRA of the employee");
		e.hra=sc.nextDouble();
		e.display();
		e.calcSalary();
		e.disp();
		e.esal();
		
	}
	

}
