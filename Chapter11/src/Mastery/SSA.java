package Mastery;

import java.io.Serializable;

public class SSA implements Serializable
{
	private String stuName, gradeLevel, semNum;
	private int grade1, grade2, grade3, grade4, avg;
	
	public SSA(String n, String gl, String sn, int g1, int g2, int g3, int g4, int a)
	{
		stuName = n;
		gradeLevel = gl;
		semNum = sn;
		grade1 = g1;
		grade2 = g2;
		grade3 = g3;
		grade4 = g4;
		avg = a;
	}
	
	public String toString()
	{
		String stuInfo;
		
		stuInfo = "Name: " + stuName + ", Grade Level: " + gradeLevel + ", Semester: " + semNum + ", Grades: " + grade1 + ", " + grade2 + ", " + grade3 + ", " + grade4 + ". Average: " + avg + "%";
		
		return(stuInfo);
	}
}
