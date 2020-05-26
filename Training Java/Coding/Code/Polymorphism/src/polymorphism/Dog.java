/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author anhnv_tt
 */
public class Dog extends Animal {

    public void move() {
        System.out.println("Dog can move too");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.move();

    }
}
