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
public class PersonMain {

    public static void main(String[] args) {
        PersonService personService = new PersonService() {
            @Override
            public void hello() {
                System.out.println("hello ");
            }

        };
        personService.hello();
        Xinchao x;
        x = new Xinchao() {
            @Override
            public void xinChao() {
                super.xinChao();
            }
        };
        x.xinChao();
    }
}

abstract class Xinchao {

    public void xinChao() {
        System.out.println("Xin chao from abstract class");
    }
}
