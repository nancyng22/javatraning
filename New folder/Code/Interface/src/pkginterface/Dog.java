/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author anhnv_tt
 */
public class Dog implements Animal{

    @Override
    public void move() {
        System.out.println("Dog can run");
    }

    @Override
    public void eat() {
        System.out.println("Dog like to eat");
    }

    @Override
    public void sleep() {
        System.out.println("Dog love to sleep in nigh time");
    }
    
}
