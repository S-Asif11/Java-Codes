package com.asif.oop;

public class StudentWithParameter {
	
	int studentId;
	String studentName;
	int studentMarks;
	char studentGrade;
	
	public void setStudentData(int id, String name, int marks) {
		studentId=id;
		studentName=name;
		studentMarks=marks;
	}
	
	public String getStudentData() {
		
		String data= "Name = "+studentName + " ;ID = "+studentId +" ;Marks ="+studentMarks +" ;Grade = "+studentGrade;
		return data;
		
	}
	
	public void studentGrade() {
		if(studentMarks>=90) {
			studentGrade='A';
		}
		if(studentMarks>=80 && studentMarks<=89) {
			studentGrade='B';
		}
		if(studentMarks>=70 && studentMarks<=79) {
			studentGrade='C';
		}
		if(studentMarks>=60 && studentMarks<=69) {
			studentGrade='D';
		}
		if(studentMarks<60) {
			studentGrade='E';
		}
	}


}
