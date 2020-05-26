/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anhnv_tt
 */
class A {
    int i;
    public A(int i) {
        this.i = i;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("From Finalize Method, i = " + i);
        super.finalize();
    }
}
public class Test {
    public static void main(String[] args) {
        A a1 = new A(10);
        A a2 = new A(20);
        try {
            a1.finalize();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        a1 = a2;
        System.out.println("done");
    }

}
