package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;

public class ReportCard extends AppCompatActivity {
    
    private String name;
    private int rollNo;
    private String numberOfSubjects;
    private String[] subjects;
    private int[] marks;

    public ReportCard(String name, int rollNo, String numberOfSubjects, String[] subjects, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.numberOfSubjects = numberOfSubjects;
        this.subjects = new String[numberOfSubjects];
        this.marks = new int[numberOfSubjects];
        System.arraycopy(subjects, 0, this.subjects, 0, numberOfSubjects);
        System.arraycopy(marks, 0, this.marks, 0, numberOfSubjects);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setNumberOfSubjects(int numberOfSubjects) {
        this.numberOfSubjects = numberOfSubjects;
    }

    public String getNumberOfSubjects() {
        return numberOfSubjects;
    }

    public void setSubjects(String[] subjects) {
        for(int i = 0; i < subjects.length; i++)
        {
            this.subjects[i] = subjects[i];
        }
    }

    public String[] getSubject() {
        return subjects;
    }

    public void setMarks(int[] marks) {
        System.arraycopy(marks, 0, this.marks, 0, numberOfSubjects);
    }

    public int[] getMarks() {
        return marks;
    }

    public String showGrade(int marks) {
        String grade;
        if (marks >= 90 && marks <= 100) {
            grade = "A";
        } else if (marks >= 80 && marks < 90) {
            grade = "B";
        } else if (marks >= 70 && marks < 80) {
            grade = "C";
        } else if (marks >= 60 && marks < 70) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }

    public String toString() {
        String temp = "Report Card of "+ name " is: " +
                "Roll Number: " + rollNo + "\n" +
                "Number of Subjects: " + numberOfSubjects + "\n" +
                "Grades: \nSubjects - Grades:\n";
                for(int i = 0; i < setNumberOfSubjects; i++)
                {
                    temp += subjects[i] + " - " + showGrade(marks[i]) + "\n";
                }
                return temp;
    }
}
