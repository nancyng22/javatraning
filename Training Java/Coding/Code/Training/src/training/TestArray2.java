/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author anhnv_tt
 */
public class TestArray2 {

    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 4, 10, -3, 25, 59};
        int[] arr1 = {5, 6, 7, 4, 10, -3, 25, 59};
        int[] arr2 = {5, 6, 7, 4, 10, -3, 25, 59};
        int key = 4;
        System.out.println("Find " + key + " at " + Arrays.binarySearch(arr, key));
        System.out.print("Arrays before sort: ");
        for (Object number : arr) {
            System.out.print(" " + number);
        }
        Arrays.sort(arr);
        System.out.print("\nArrays after sort: ");
        for (Object number : arr) {
            System.out.print(" " + number);
        }
        Arrays.fill(arr, 2, 5, 90);
        System.out.print("\nArrays after fill: ");
        for (Object number : arr) {
            System.out.print(" " + number);
        }
        System.out.print("\nCompare 2 arrays: ");
        boolean result = Arrays.equals(arr, arr1);
        System.out.println(result);
        System.out.print("\nCompare 2 arrays: ");
        boolean result2 = Arrays.equals(arr1, arr2);
        System.out.println(result2);

    }
}
