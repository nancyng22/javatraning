/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.util.Scanner;

/**
 *
 * @author anhnv_tt
 */
public class ExampleVoid {
    
    public static void main(String[] args) {
        
        rank(5);
    }
    
    public static void rank(double point) {
        if (point >= 5) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
