/**
 * 
 */
package com.srinivas.corejava;

/**
 * @author SCnu
 *
 */
    public class MethodOverLoading 
    {
	int studentCount = 0;
	int studentId;
	String studentName;
	String studentType;
	float studentFee;
	
	public int UpdateStudent(int stuId,String stuName)
	{
	    studentId = stuId;
	    studentName = stuName;
		studentCount = studentCount + 1;
	    return studentCount;
	}
	
	public int UpdateStudent(int stuId,float stuFee)
	{
	    studentId = stuId;
	    studentFee = stuFee;
		studentCount = studentCount + 1;
	    return studentCount;
	}
	
	public int UpdateStudent(int stuId,String stuName,String stuType)
	{
	    studentId = stuId;
	    studentName = stuName;
	    studentType = stuType;
		studentCount = studentCount + 1;
	    return studentCount;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MethodOverLoading m1 = new MethodOverLoading();
       
       m1.UpdateStudent(1, "Srinivas");
       System.out.println("Student Count: "+m1.studentCount);
       System.out.println("Student ID: "+m1.studentId);
       System.out.println("Student Name: "+m1.studentName);

       m1.UpdateStudent(2, "Rakesh", "Graduate");
       System.out.println("Student Count: "+m1.studentCount);
       System.out.println("Student ID: "+m1.studentId);
       System.out.println("Student Name: "+m1.studentName);
       System.out.println("Student Type: "+m1.studentType);
       
       m1.UpdateStudent(1, 100.00F);
       System.out.println("Student Count: "+m1.studentCount);
       System.out.println("Student ID: "+m1.studentId);
       System.out.println("Student Name: "+m1.studentName);
       System.out.println("Student Fee: "+m1.studentFee);
	}

}
