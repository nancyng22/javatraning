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
public class number {

    public static void main(String[] args) {
        Integer a = 5;
        int x = a.intValue();
        System.out.println(x);

        x = a.compareTo(5); //return 0 if =
        System.out.println("compare to 5 : " + x);

        x = a.compareTo(6); // -1 if >
        System.out.println("compare to 6 : " + x);

        x = a.compareTo(3); // a if <
        System.out.println("compare to 3 : " + x);

        boolean check = a.equals(6.5f);
        System.out.println("Check with equals: ");
        System.out.println(check);

        String string = a.toString(); //string= "5"
        System.out.println(string);

        float e = Float.parseFloat("3492");
        System.out.println(e);
    }
}
