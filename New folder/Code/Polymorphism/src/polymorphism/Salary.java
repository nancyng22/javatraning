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
public class Salary extends Employee {

    private double salary;

    public Salary() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0) {
            salary = newSalary;
        }
    }

    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName()
                + " with salary " + salary);
    }

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public double computePay() {
        System.out.println("Salary computePay() for : " + getName());
        return salary / 52;
    }

}
