/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excersice;

import java.util.Scanner;

/**
 *
 * @author anhnv_tt
 */
/*
Dãy số Fibonacci được định nghĩa như sau: F0 = 0, F1 = 1, F2 = 1, Fn = F(n-1) + F(n-2) 
với n >= 2. Ví dụ: 0, 1, 1, 2, 3, 5, 8, ... Hãy viết chương trình tìm n số Fibonacci 
đầu tiên.
 */
public class Ex5 {
    
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            System.out.print(fibonancci(i) + ", ");
        }
        System.out.println(fibonancci(n -1));
        
    }
    
    public static int fibonancci(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonancci(n - 1) + fibonancci(n - 2);
        }
    }
}
