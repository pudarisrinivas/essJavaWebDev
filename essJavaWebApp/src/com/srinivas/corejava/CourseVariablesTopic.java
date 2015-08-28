package com.srinivas.corejava;

/**
 * @author SCnu
 *
 */
public class CourseVariablesTopic
{
 short courseId;
 String courseName;
 float courseFee;
  public void updateCourse(short cId, String cName, float cFee)
  {
   courseId = cId;
   courseName = cName;
   courseFee = cFee;
  }
  public void courseDisplay()
  {
   // System.out.println("Student Name"+stdName);
    System.out.println("Course ID"+courseId);
    System.out.println("Course Name"+courseName);
    System.out.println("Course Fee"+courseFee);
    System.out.println("-----------------------");
  }
  CourseVariablesTopic c = new CourseVariablesTopic();
  }