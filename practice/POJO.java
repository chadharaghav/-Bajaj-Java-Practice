package day_two;

// POJO -> Plain Old Java Object

class Person {
	
@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public Person(String name, int age, int salary, String address) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}

	private String name;
	private int age;
	private int salary;
	private String address;
}


public class POJO {

	public static void main(String args[]) {
		Person ansar = new Person("Ansar", 35, 10000, "Chennai");
		System.out.println(ansar.toString());
		
		Person ajay = new Person("Ajay", 10, 5000, "Chennai");
		System.out.println(ajay.toString());
		
		Person varun = new Person("Varun", 18, 55000, "Pune");
		System.out.println(varun.toString());
		
		Person siddharth = new Person("Siddharth", 25, 78000, "Delhi");
		System.out.println(siddharth.toString());
	}

}
