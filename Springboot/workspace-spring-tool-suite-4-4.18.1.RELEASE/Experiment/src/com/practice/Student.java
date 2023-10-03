package com.practice;

public class Student {
	private int studentId;
    private  String studentName;
    private int Classname;

    public Student(int studentId, String studentName, int Classname) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.Classname = Classname;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", Classname=" + Classname + "]";
	}

	public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int isClassname() {
        return Classname;
    }

    public void setClassname(int Classname) {
        this.Classname = Classname;
    }

}
