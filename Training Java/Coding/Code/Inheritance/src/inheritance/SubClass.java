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
public class SubClass extends SuperClass {

    int n;

    public SubClass() {
        this.n = 50;
    }

    @Override
    public void display() {
        System.out.println("this is sub class");
    }

    public void my_method() {
        SubClass subClass = new SubClass();
        subClass.display();
        super.display();
        System.out.println("num in super class: " + super.number);
        System.out.println("num in sub class: " + n);
    }

}
