/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclass;

/**
 *
 * @author anhnv_tt
 */
public class Animal {

    //non static inner class
    public class Dog {

        private int name;

        public void hello() {
            System.out.println("hello ");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal.Dog dog = animal.new Dog();
        dog.hello();
    }
}
