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
Viết chương trình chuyển đổi một số tự nhiên ở hệ số 10 thành một số ở hệ 
cơ số B (1 <= B <= 32) bất kỳ. Giả sử hệ cơ số cần chuyển là 2 <= B <= 16.
Số đại điện cho hệ cơ số B > 10 là A = 10, B = 11, C = 12, D = 13, E = 14, F = 15.
 */
public class Ex4 {

    public static final char CHAR_55 = 55;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("So " + n + " chuyen sang he co so 2: " + convertNumber(n, 2));
        System.out.println("So " + n + " chuyen sang he co so 16: " + convertNumber(n, 16));
    }

    public static String convertNumber(int n, int b) {
        if (n < 0 || b < 2 || b > 16) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int m;
        int remainder = n;

        while (remainder > 0) {
            if (b > 10) {
                m = remainder % b;
                if (m >= 10) {
                    sb.append((char) (CHAR_55 + m));
                } else {
                    sb.append(m);
                }
            } else {
                sb.append(remainder % b);
            }
            remainder /= b;
        }
        return sb.reverse().toString();
    }
}
