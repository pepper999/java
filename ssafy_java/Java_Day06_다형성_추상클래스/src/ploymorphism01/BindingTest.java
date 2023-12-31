package ploymorphism01;

class Parent {
	String x = "parent";

	public String method() {
		return "parent method!!!!";
	}
}

class Child extends Parent {
	String x = "child";

	@Override
	public String method() {
		return "child method!!!!";
	}
}

public class BindingTest {
	public static void main(String[] args) {
//	    Parent p = new Parent();
//	    Child c = new Child();
//	    System.out.println(p.x); // parent
//	    System.out.println(p.method()); // parent method
//	    System.out.println(c.x); // child
//	    System.out.println(c.method()); // child method
	    
	    Parent p = new Child();
	    System.out.println(p.x); // parent
	    System.out.println(p.method()); // child method (동적바인딩)
	}
}
