/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anhnv_tt
 */
public class ReadSingleObject {

    public static void main(String[] args) throws IOException {
        Object obj = null;
        try {
            //doc file ObjectInputStream
            FileInputStream fis = new FileInputStream("input.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //doc doi tuong ra
            obj = ois.readObject();
            while (fis.available() > 0) {
                obj = ois.readObject();
                System.out.println(obj);
            }
            
            ois.close();
            fis.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadSingleObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadSingleObject.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
