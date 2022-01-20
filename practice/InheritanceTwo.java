package day_two;

class camera {	
	public void printCamera() {
		System.out.println("5 MP");
	}
}

//every method in the interface is abstract method
abstract interface processor {
	abstract public void printProcessor();
}

//multiple inheritance is not supported by java
class Mobile extends camera implements processor {

	@Override
	public void printProcessor() {
		// TODO Auto-generated method stub
		System.out.println("Snapdragon 850");
	}	
}

public class InheritanceTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile = new Mobile();
		mobile.printCamera();
		mobile.printProcessor();
	}

}
