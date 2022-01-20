package day_two;


class A	{
	int a;
	
	A(int a) {
	this.a=a;
	}

	A()	{	
	}

	A(int a,int b)	{
	}

	public A(int i, int j, int k) {
	// TODO Auto-generated constructor stub
	}
	
	public void printA() {
		System.out.println("A class");
	}
}


class B extends A {
	 B(int a) {
		  super();
		  System.out.println("A  ");
		  System.out.println("b  ");
		  System.out.println("c ");
	}
	
	public void printB() {   
		System.out.println("B class " + a);
	}
}

public class InheritanceOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B(200);
		System.out.println(obj.a); 
		obj.printA();
		obj.printB();
	}

}
