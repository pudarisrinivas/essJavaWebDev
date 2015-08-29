/**
 * 
 */
package com.srinivas.corejava;

/**
 * @author SCnu
 *
 */
public class ConstructorDemo {
	
	int studentId;
	String studentName;
	static String studentCourse = "java";
	
	/**
	 * @param args
	 */
	public ConstructorDemo() {
    // public int ConstructorDemo() {
		// TODO Auto-generated constructor stub
		//System.out.println("I am in Constructor");
		studentId = 1;
		studentName = "Srinivas";
		//return 100;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorDemo c1 = new ConstructorDemo();
		System.out.println(c1.studentId);
		System.out.println(c1.studentName);
		System.out.println(c1.studentCourse);
	}

}
