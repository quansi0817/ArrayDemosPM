
package com.mycompany.aarrydemo1;


public class StudentList {
    public static void main(String[]args){
      Student s1  = new Student("S1","Ronak");
      Student[] studentList = new Student[3];
      studentList[0]=s1;
      studentList[1]=new Student("S2","abc");
      studentList[2]=new Student("S3","def");
      
      for(int i=0; i<studentList.length; i++)
          System.out.println(studentList[i].getStudentName());
    }
    }

