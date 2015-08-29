/**
 * 
 */
package com.srinivas.corejava;

/**
 * @author SCnu
 *
 */
public class StaticExample {
	/**
	 * @param args
	 */
	int studentId;
	String studentName;
	static String course = "First-Java";
	
	static void change()
	{
		System.out.println("Entered Change Method .."+course);
		course = "Second.Net";
		System.out.println("Modified Change Method .."+course);
	}
	
	static
	{
		System.out.println("Entered Static Block .."+course);
		course = "Third-Php";
		System.out.println(course);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Java8 requires at least main method, no need to create object for static block
		StaticExample s = new StaticExample();
		s.change();
	}


}
