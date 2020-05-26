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
public class Cat implements Animal {

    @Override
    public void move() {
        System.out.println("Cat can dance ");
    }

    @Override
    public void eat() {
        System.out.println("Cat love fish");
    }

    @Override
    public void sleep() {
        System.out.println("Can can sleep anywhere in your house");
    }

}
