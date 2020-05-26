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
public class Person {

    public static class Kid {

        private int age;

        public void hello() {
            System.out.println("hello kid");
        }
    }

    public static void main(String[] args) {
        Person.Kid kid = new Person.Kid();
        kid.hello();
    }
}
