/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

/**
 *
 * @author anhnv_tt
 */
public class TestArray {

    public static void main(String[] args) {
        double[] array = {1.9, 2.9, 3.9, 5, 6.7, 4, 6};

        System.out.println("Your array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Total arry: " + sum);
        System.out.println("Size of array: " + array.length);
        double max = Double.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Max of array: " + max);
    }
}
