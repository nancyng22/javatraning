/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

/**
 *
 * @author anhnv_tt
 */
public class Constructors {
    
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentID("HE130xxx");
        student.setName("Van Anh");
        student.setGrade(9.9);
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student grade: " + student.getGrade());
        
    }
}
