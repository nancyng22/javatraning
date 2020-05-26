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
public class MyCalculation extends Calculation {
    
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("multiplication z = " + z);
    }
    
    public static void main(String[] args) {
        int a = 20, b = 10;
        MyCalculation myCalculation = new MyCalculation();
        myCalculation.addition(a, b);
        myCalculation.subtraction(a, b);
        myCalculation.multiplication(a, b);
    }
}
