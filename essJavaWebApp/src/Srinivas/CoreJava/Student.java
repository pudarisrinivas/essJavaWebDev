package Srinivas.CoreJava;

public class Student {
 int stdId;
 String stdName;
 String stdCourse;
 double stdFee;
 boolean isStatus;
 String stdStatus;

 public void updateDetails(int sId,String sName,String sCourse,double sFee,boolean isStat)
 {
  stdId = sId;
  stdName = sName;
  stdCourse = sCourse;
  stdFee = sFee;
  isStatus = isStat;
  
  if(isStatus == true)
  {
    stdStatus = "Active";
  }
  else
  {
       stdStatus = "Inactive";
  }
  
 }
 
 public void printDetails()
 {
  System.out.println("Student ID:"+stdId);
  System.out.println("Student Name:"+stdName);
  System.out.println("Student Course:"+stdCourse);
  System.out.println("Student Fee:"+stdFee);
  System.out.println("Student Status:"+stdStatus);
  System.out.println("----------------------------");
 }
 /**
  * @param args
  */
 public static void main(String[] args) {
  // TODO Auto-generated method stub
     Student s1 = new Student();
     Student s2 = new Student();
     s1.updateDetails(1, "Srinivas", "Java", 1000,true);
     s2.updateDetails(2, "Rakesh", "Front End", 2000,false);
  s1.printDetails();
  s2.printDetails();
 }
}