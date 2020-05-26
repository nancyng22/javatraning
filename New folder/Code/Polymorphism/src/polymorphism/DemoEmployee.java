/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author anhnv_tt
 */
public class DemoEmployee {

    public static void main(String[] args) {
        Salary s = new Salary("Van Anh", "Thai Nguyen", 994, 1000);
        Employee e = new Salary("Hien", "Ha Noi", 3954, 2000);
        System.out.println("Call mailCheck using Salary reference");
        s.mailCheck();
        System.out.println("\n");
        System.out.println("Call mailCheck using Employee reference");
        e.mailCheck();
    }
}
