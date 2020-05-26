/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author anhnv_tt
 */
public class SubStudent extends Student {

    SubStudent(String name) {
        super();
    }

    public static void main(String[] args) {
        SubStudent subStudent = new SubStudent("Van Anh");
        subStudent.getName();

    }

}
