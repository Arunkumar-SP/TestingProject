package com.lti.fullstack.repo;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepository {
	public static List<Student> getStudents(){
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("First", 2, 3.6, "Male", Arrays.asList("Swimming", "Basketball")));
		students.add(new Student("Second", 2, 3.8, "Female", Arrays.asList("Swimming", "Basketball", "Gymnastics")));
		students.add(new Student("Third", 3, 4.0, "Male", Arrays.asList("Cricket", "Basketball")));
		students.add(new Student("Fourth", 3, 3.9, "Female", Arrays.asList("Vollybll", "Basketball")));
		students.add(new Student("Fifth", 4, 3.3, "Male", Arrays.asList("Soccor", "Basketball")));
		students.add(new Student("Sixth", 4, 3.5, "Female", Arrays.asList("Swimming", "Basketball")));
		
		return students;
	}
	
	
	public static Map<Integer,Student>  getStudentsAsMap(){
		Map<Integer,Student> students = new HashMap<Integer,Student>();
		
		students.put(1,new Student("First", 2, 3.6, "Male", Arrays.asList("Swimming", "Basketball")));
		students.put(2,new Student("Second", 2, 3.8, "Female", Arrays.asList("Swimming", "Basketball", "Gymnastics")));
		students.put(3,new Student("Third", 3, 4.0, "Male", Arrays.asList("Cricket", "Basketball")));
		students.put(4,new Student("Fourth", 3, 3.9, "Female", Arrays.asList("Vollybll", "Basketball")));
		students.put(5,new Student("Fifth", 4, 3.3, "Male", Arrays.asList("Soccor", "Basketball")));
		students.put(6,new Student("Sixth", 4, 3.5, "Female", Arrays.asList("Swimming", "Basketball")));
		
		return students;
	}
	
	
	
	
	
	
	
	
	
}