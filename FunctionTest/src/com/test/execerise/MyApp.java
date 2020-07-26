package com.test.execerise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import com.lti.fullstack.repo.Student;
import com.lti.fullstack.repo.StudentRepository;
import static java.util.stream.Collectors.toList;

//extract name and activities of all students as map whose grade > 2 and gpa >=3.5
//using max functional interfaces

public class MyApp {

	/*
	 * static Consumer<Student> nameDisplay = student ->
	 * System.out.println(student.getName());
	 * 
	 * static Consumer<Student> activitiesDisplay = student ->
	 * System.out.println(student.getActivities());
	 * 
	 * static Predicate<Student> filterOnGrade = student -> student.getGrade() > 2;
	 * 
	 * // static Predicate<Student> filterOnGpa = student -> student.getGpa() >=
	 * 3.5; static Predicate<Student> filterOnGpa = MyApp :: filterStudentsOnGpa;
	 * 
	 * static Supplier<List<Student>> studentsFromRepository = () ->
	 * StudentRepository.getStudents();
	 * 
	 * 
	 * public static void displayNamesOfAll() { // forEach added with default
	 * definition // forEach(<Consumer>) //
	 * StudentRepository.getStudents().forEach(nameDisplay); // ~ accept
	 * studentsFromRepository.get().forEach(nameDisplay); // ~ accept }
	 * 
	 * public static void displayNamesAndActivitiesOfAll() { // forEach added with
	 * default definition // forEach(<Consumer>)
	 * StudentRepository.getStudents().forEach(nameDisplay.andThen(activitiesDisplay
	 * )); }
	 * 
	 * public static void displayNamesAndActivitiesOfAllBasedOnGrade() { // forEach
	 * added with default definition // forEach(<Consumer>)
	 * StudentRepository.getStudents().forEach(student -> { if(student.getGrade() >
	 * 2) { nameDisplay.andThen(activitiesDisplay).accept(student); } //
	 * if(filterOnGrade.and(filterOnGpa).test(student)) { if(filterOnGrade.and(
	 * MyApp:: filterStudentsOnGpa).test(student)) {
	 * nameDisplay.andThen(activitiesDisplay).accept(student); } });
	 * 
	 * }
	 */
	
    static Function<String, String> upperCase = str -> str.toUpperCase();
	
	static Function<String, String> addSomeString = str -> str.concat("dummy");

	public static void displayNamesAndActivitiesOfAllBasedOnGradeAsMap() {
		// forEach added with default definition
		// forEach(<Consumer>)
		StudentRepository.getStudentsAsMaP().forEach((number, stud) -> {

			if (stud.getGrade() > 2 && stud.getGpa() >= 3.5) {
				System.out.println(number+""+stud.getName() + "" + stud.getActivities());
			}

		}

		);

	}

	/*
	 * static boolean filterStudentsOnGpa(Student student) { if (student.getGpa() >=
	 * 3.5) return true; return false;
	 * 
	 * }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// displayNamesOfAll();
		// displayNamesAndActivitiesOfAll();
		displayNamesAndActivitiesOfAllBasedOnGradeAsMap();

	}

}