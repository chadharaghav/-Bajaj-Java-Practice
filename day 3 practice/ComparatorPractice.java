package day_three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	String name;
	int rollNo;
	
	Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}

class SortByName implements Comparator<Student> {	 
    public int compare(Student a, Student b)	{
        return a.name.compareToIgnoreCase(b.name);
    }
}

class SortByRollNo implements Comparator<Student> {	 
    public int compare(Student a, Student b)	{
        return a.rollNo - b.rollNo;
    }
}

public class ComparatorPractice {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

		students.add(new Student("siddharth", 5));
		students.add(new Student("Aayush", 41));
		students.add(new Student("Kushagra", 10));
		students.add(new Student("Piyush", 28));
		students.add(new Student("Dikshita", 22));
		
		System.out.println("Sorting by name!");
		Collections.sort(students, new SortByName());
		
		for (Student st: students) {
			System.out.println(st.rollNo);
			System.out.println(st.name);
			System.out.println();
		}
		
		System.out.println("Sorting by roll no!");
		Collections.sort(students, new SortByRollNo());
		
		for (Student st: students) {
			System.out.println(st.rollNo);
			System.out.println(st.name);
			System.out.println();
		}
			
	}

}
