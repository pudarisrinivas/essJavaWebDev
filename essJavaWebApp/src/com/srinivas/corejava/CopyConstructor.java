/**
 * 
 */
package com.srinivas.corejava;

/**
 * @author SCnu
 *
 */
public class CopyConstructor {
	/**
	 * @param args
	 */
	int studentId;
	String studentName;
	
	int studentIdNumber;
	String studentFullName;
	
	public CopyConstructor(int stuId,String stuName)
	{
		studentId = stuId;
		studentName = stuName;
	}
	
	public CopyConstructor(CopyConstructor cc) //It will accept first object reference
	{
		studentIdNumber = cc.studentId;
		studentFullName = cc.studentName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyConstructor c1 = new CopyConstructor(1,"Srinivas");
		System.out.println(c1.studentId);
		System.out.println(c1.studentName);
		
	    CopyConstructor c2 = new CopyConstructor(c1);
	    //Here we are passing first object reference
	    System.out.println(c2.studentIdNumber);
	    System.out.println(c2.studentFullName);
		
	}

}
