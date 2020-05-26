/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author anhnv_tt
 */
public class SubClass extends SuperClass {

    @Override
    public double sum(double a, double b) {
        return a + b + 20; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int sum(int a, int b) {
        return a + b + 20; //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        SubClass sub = new SubClass();
        SuperClass superClass = new SuperClass();
        System.out.println("Sub Class: " + sub.sum(10, 50));
        System.out.println("Super Class: " + superClass.sum(50, 60));
    }
}
