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
public class Outer {

    private int age;

    public Outer() {
        age = 100;
    }

    public Outer(int age) {
        this.age = age;
    }

    public void sayHello() {
        Inner inner = new Inner();
        inner.show();
    }

    private class Inner {

        private String name;
        private float f;
        public final static int MAX = 299;

        public void showInfor() {
            System.out.println("outer age: " + age);
        }

        void show() {
            System.out.println("Say hello from inner class ");
            System.out.println("outer age: " + Outer.this.age);
        }
    };

}
