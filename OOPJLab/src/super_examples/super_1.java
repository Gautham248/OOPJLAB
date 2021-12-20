package super_examples;


class S1{
	int data=50;
	void say() {System.out.println("Data in base: \n\n"+data);
}}

class S2 extends S1{
	int data=100;
	void sayData() {
		System.out.println("Data in Derived: "+data);
		System.out.println("Derived--\n Display S1 data in S2: "+super.data);
	}
}
public class super_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S2 ob=new S2();
		ob.say();
		ob.sayData();

	}

}
