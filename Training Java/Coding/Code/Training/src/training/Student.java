/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.io.Serializable;

/**
 *
 * @author anhnv_tt
 */
public class Student implements Serializable{

    private String name;
    private String studentID;
    private double grade;

    public Student() {
    }

    public Student(String name, String studentID, double grade) {
        this.name = name;
        this.studentID = studentID;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", studentID=" + studentID + ", grade=" + grade + '}';
    }

}
