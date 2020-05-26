/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asg2;

import java.util.ArrayList;

/**
 *
 * @author anhnv_tt
 */
public class Asg1 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 50; i <= 500; i++) {
            if (i % 3 == 0 && i % 9 != 0) {
                arr.add(i);

            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size() - 1) {
                System.out.println(arr.get(i));
            } else {
                System.out.print(arr.get(i) + ", ");
            }
        }
    }
}
