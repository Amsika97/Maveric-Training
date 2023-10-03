package com.practice;
import java.util.List;
import java.util.ArrayList;
import com.practice.Student;

public class StudentPractice {
	public static void main(String args[]){
        List<Student> students=new ArrayList();
//        Student st= new Student();
        //List<Student> abc=new ArrayList();
        
        students.add(new Student(1001,"Steve",12));
        students.add(new Student(1002,"Rachel",12));
        students.add(new Student(1003,"Monica",11));
        students.add(new Student(1004,"David",11));
        students.add(new Student(1005,"Harry",10));
        
        students.stream().filter(e->e.Classname>10).forEach(System.out::println);

//        for (Student student:students){
//            System.out.println("Student Id: "+student.getStudentId());
//            System.out.println("Student Name: "+student.getStudentName());
//            System.out.println("Course Registered: "+student.isClassname());
//
//        }
//      
//         for(int i; i<=students.size(); i++)
//        {
//        	 System.out.println("Student Id: "+);
//             System.out.println("Student Name: "+abc.getStudentName());
//             System.out.println("Course Registered: "+abc.isClassname());
//        	
//        }
          
  System.out.println(students);
    }

}
