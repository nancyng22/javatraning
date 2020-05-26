/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclass;

/**
 *
 * @author anhnv_tt
 */
public class Employee {

    public void salary() {
        class Worker {

            private String name;

            public void salary() {
                System.out.println("employee's salary");
            }

        }
        Worker worker = new Worker();
        worker.salary();
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.salary();
    }
}
