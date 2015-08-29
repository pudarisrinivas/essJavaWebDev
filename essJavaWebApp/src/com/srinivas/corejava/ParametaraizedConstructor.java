/**
 * 
 */
package com.srinivas.corejava;

/**
 * @author SCnu
 *
 */
public class ParametaraizedConstructor {
	/**
	 * @param args
	 */
	int studentId;
	String studentName;
	
	public ParametaraizedConstructor()
	{
		System.out.println("I am in default Constructor");
		studentId = 000;
		studentName = "Rakesh";
	}
	public ParametaraizedConstructor(int stuId,String stuName) 
	{
		// TODO Auto-generated constructor stub
		System.out.println("I am in Parameterized Constructor");
		studentId = stuId;
		studentName = stuName;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParametaraizedConstructor pc = new ParametaraizedConstructor();
		System.out.println(pc.studentId);
		System.out.println(pc.studentName);
		//If we call explicitly default constructor then only it will gets executed
		//If we don't call, then Parameterized construtor will be overload default consutructor
		ParametaraizedConstructor pc1 = new ParametaraizedConstructor(1,"Srinivas");
		System.out.println(pc1.studentId);
		System.out.println(pc1.studentName);
	}

}
