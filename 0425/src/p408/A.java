package p408;

public class A {
	
	String field_Outter="outfild";
	int fieldA;
	void methodA() {
		System.out.println("outfiled()");
	}
	
	static int fieldA1;
	static void methodA1() {}
	
	A(){System.out.println("A梓端 持失!!");}
	
	class B{
		B(){System.out.println("B梓端 持失!!");}
		
		String field_nested="nested_field";
		int field;
		//static int field1;
		void methodB() {
			fieldA=1;
			methodA();
			fieldA1=2;
			methodA1();
			System.out.println("nestedMethod()");
		}
		//static void method1() {}
		void print() {
			System.out.println(this.field_nested);
			this.methodB();
			
			System.out.println(A.this.field_Outter);
			A.this.methodA();
		}
	}
	
	static class C{
		C() {System.out.println("C梓端 持失!!");}
		int field;
		static int field1;
		void method() {
//			fieldA=1;
//			methodA1();
			fieldA1=1;
			methodA1();
		}
		static void method1() {}
	}
	
	public void method() {
		int localVar=1;
		localVar=100;
		
		class D{
			D(){System.out.println("D梓端 持失!!");}
			int field;
			//static int field1;
			void method() {}
			//static void method1() {}
		}
		D d = new D();
		d.field=1;
	}
}
