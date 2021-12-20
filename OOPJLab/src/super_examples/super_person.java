package super_examples;
class Person{
	int id;
	String name;
	Person(int id,String name){
		this.id=id;this.name=name;
	}
}
class emp extends Person{
	int salary;
	emp(int id,String name,int salary){
		super(id,name);
		this.salary=salary;
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
	
}
public class super_person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp e1=new emp(1,"ankit",45000);
		emp e2=new emp(2,"ketin",50000);
		e1.display();
		e2.display();

	}

}