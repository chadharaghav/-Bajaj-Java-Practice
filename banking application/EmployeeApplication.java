package day_two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Employee {
	String name;
	int id;
	
	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}

public class EmployeeApplication {
	static Scanner scn = new Scanner(System.in);
	static List<Employee> employees = new ArrayList<>();
	
	public static void insert() {
		scn.nextLine();
		System.out.println("ENTER EMPLOYEE NAME : ");
		String name = scn.nextLine();
		System.out.println("ENTER EMPLOYEE ID : ");
		int id = scn.nextInt();
		Employee employee = new Employee(name, id);
		employees.add(employee);
	}
	
	public static void display() {
		for (Employee emp: employees) {
			System.out.println(emp.id);
			System.out.println(emp.name);
			System.out.println();
		}
	}
	
	public static int find(int id) {
		for(int i = 0; i < employees.size(); ++i) {
			if (employees.get(i).id == id) {
				return i;
			}
		}
		return -1;
	}
	
	public static void delete() {
		scn.reset();
		System.out.println("ENTER THE EMPLOYEE ID THAT YOU WISH TO DELETE : ");
		int id = scn.nextInt();
		int index = find(id);
		if (index == -1) {
			System.out.println("NO SUCH EMPLOYEE EXISTS!");
		} else {
			employees.remove(index);
			System.out.println("EMPLOYEE DELETED SUCCESSFULLY!");
		}
	}
	
	public static void search() {
		scn.reset();
		scn.nextLine();
		System.out.println("ENTER EMPLOYEE NAME THAT YOU WANT TO SEARCH : ");
		String name = scn.nextLine();
		boolean found = false;
		for (int i = 0; i < employees.size(); ++i) {
			if (employees.get(i).name.equalsIgnoreCase(name)) {
				System.out.println("RECORD FOUND!");
				System.out.println(employees.get(i).id);
				System.out.println(employees.get(i).name);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("NO SUCH EMPLOYEE EXISTS!");
		}
	}
	
	public static void update() {
		scn.reset();
		scn.nextLine();
		System.out.println("ENTER THE EMPLOYEE ID OF THE EMPLOYEE YOU WISH TO UPDATE : ");
		int id = scn.nextInt();
		boolean found = false;
		for (int i = 0; i < employees.size(); ++i) {
			if (employees.get(i).id == id) {
				System.out.println("RECORD FOUND!");
				System.out.println(employees.get(i).id);
				System.out.println(employees.get(i).name);
				scn.nextLine();
				System.out.println("ENTER NEW NAME : ");
				String name = scn.nextLine();
				Employee updated = new Employee(name, employees.get(i).id);
				employees.set(i, updated);
				System.out.println("RECORD HAS BEEN UPDATED!");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("NO SUCH EMPLOYEE EXISTS!");
		}
	}
	
	public static void sortAsc() {
		Collections.sort(employees, Comparator.comparing(Employee::getId));
		System.out.println("Employees have been sorted in ascending order!");
	}
	
	public static void sortDsc() {
		Collections.sort(employees, Comparator.comparing(Employee::getId));
		System.out.println("Employees have been sorted in descending order!");
	}
	
	public static void main(String[] args) {
		boolean running = true;
		while (running) {
			int choice;
			System.out.println();
			System.out.println();
			System.out.println("WHAT DO YOU WISH TO DO?");
			System.out.println("1. INSERT");
			System.out.println("2. DISPLAY");
			System.out.println("3. DELETE");
			System.out.println("4. UPDATE");
			System.out.println("5. SEARCH BY NAME");
			System.out.println("6. SORT IN ASCENDING ORDER (ON BASIS OF EMPLOYEE ID)");
			System.out.println("7. SORT IN DESCENDING ORDER (ON BASIS OF EMPLOYEE ID)");
			System.out.println("8. QUIT");
			System.out.println("PLEASE ENTER A CHOICE : ");
			choice = scn.nextInt();
			
			switch (choice) {
			case 1:
				insert();
				break;
			
			case 2:
				display();
				break;
			
			case 3:
				delete();
				break;
				
			case 4:
				update();
				break;
				
			case 5:
				search();
				break;
				
			case 6:
				sortAsc();
				break;
				
			case 7:
				sortDsc();
				break;
				
			case 8:
				System.out.println("Exiting application...");
				scn.close();
				running = false;
				break;
				
			default:
				System.out.println("You have entered an invalid choice!");
			}
		}
	}
}
