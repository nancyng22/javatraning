package training;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anhnv_tt
 */
public class SingleObjecInputOutputSample {

    public static void main(String[] args) {
//        Student student = new Student("Van Anh", "HE130", 1);
        Student student1 = new Student("Van Anh", "HE10", 2);
        Student student2 = new Student("Van Anh", "HE130", 3);

        try {
            //ghi file
            FileOutputStream fos = new FileOutputStream("input.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(student);
            oos.writeObject(student1);
            oos.writeObject(student2);
            oos.close();
            fos.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(SingleObjecInputOutputSample.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SingleObjecInputOutputSample.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
