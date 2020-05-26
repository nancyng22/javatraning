/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anhnv_tt
 */
public class Test {

    public static void main(String[] args) throws IOException {
        //ghi du lieu
        List<Student> list = new ArrayList<>();
        list.add(new Student("A", "Male"));
        list.add(new Student("B", "Male"));
        list.add(new Student("C", "Female"));

        FileOutputStream out = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            out = new FileOutputStream("student.dat");
            objectOutputStream = new ObjectOutputStream(out);
            objectOutputStream.writeObject(list);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
        }
        //doc du lieu 
        FileInputStream in = null;
        ObjectInputStream objectInputStream = null;
        try {
            in = new FileInputStream("student.dat");
            objectInputStream = new ObjectInputStream(in);
            list = (List<Student>) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if (objectInputStream != null) {
                objectInputStream.close();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).display();
        }

    }
}
