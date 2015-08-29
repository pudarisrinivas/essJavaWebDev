/**
 * 
 */
package com.srinivas.corejava;

/**
 * @author SCnu
 *
 */
public class CopyValuesWithOutConstructor {
	/**
	 * @param args
	 */
	int studentId;
	String studentName;
	
	int studentIdNumber;
	String studentFullName;
	
	public CopyValuesWithOutConstructor(int stuId,String stuName) 
	{
		// TODO Auto-generated constructor stub
		System.out.println("First Constructor");
		studentId = stuId;
		studentName = stuName;
		
	}
	public CopyValuesWithOutConstructor()
	{
		//We need to create empty object for that we need default constructor
		//other wise we cannot empty object as we have written parameterized constructor
	}
	

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyValuesWithOutConstructor c1 = new CopyValuesWithOutConstructor(1, "Srinivas");
		System.out.println("Student ID: "+c1.studentId+"--c1 object--"+"Student Name: "+c1.studentName);
		
		CopyValuesWithOutConstructor c2 = new CopyValuesWithOutConstructor();
		c2.studentIdNumber = c1.studentId;
		c2.studentFullName = c1.studentName;
		System.out.println("Student ID: "+c2.studentIdNumber+"--c2 object-- "+"Student Name: "+c2.studentFullName);
		
	}

}
