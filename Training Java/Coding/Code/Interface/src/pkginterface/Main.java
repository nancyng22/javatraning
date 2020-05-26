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
public class Main {

    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal animal1 = new Cat();
        animal.eat();
        animal.move();
        animal1.eat();
        animal1.sleep();
    }

}
