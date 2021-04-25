package p426;

public class A {

	
	Parent field = new Parent() {

		
		int childField;
		void childMethod() {}
		
		@Override
		void parentMethod() {
			// TODO Auto-generated method stub
			super.parentMethod();
		//line 8~11 익명개체 why? -> 부모인지 자식인지 몰라서
		}
		
	};
	
	void methodA(Parent parent) {
		
		field.parentMethod();
		
		Parent localVar = new Parent() {

			@Override
			void parentMethod() {
				// TODO Auto-generated method stub
				super.parentMethod();
			}
			
		};
	}
	
	void methodA1() {
		methodA(new Parent() {

			@Override
			void parentMethod() {
				// TODO Auto-generated method stub
				super.parentMethod();
			}
			
		});
	}
}
