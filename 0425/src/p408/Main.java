package p408;

public class Main {
	public static void main(String ar[]) {
		A a=new A();
		
		
		A.B ab = a.new B();
		ab.field=3;
		
		
		A.C ac = new A.C();
		ac.field1=1;
		
		a.method();
		ab.print();
	}
}
