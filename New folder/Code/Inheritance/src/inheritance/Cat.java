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
public class Cat extends Animal {

    @Override
    public void move() {
        System.out.println("Dogs can walk and run");

    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        animal.move();
        cat.move();
    }

}
