package p297;

import p297.test1.A;

public class B{

	A a1 = new A(true);
//	A a2 = new A(1); // -> default는 package 내에서만 접근 가능!
//	A a3 = new A("접근"); -> private는 외부에서 접근안됨!
}
