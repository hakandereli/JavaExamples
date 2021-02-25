package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public class IoService {

    List<Person> personList = new ArrayList<Person>();

    public void yazObject(List<Person> pList){
        try {
            FileOutputStream fs = new FileOutputStream("src\\main\\java\\io\\dosya\\people.txt", true);
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(pList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Person> okuObject() {
        try {
            FileInputStream fi = new FileInputStream("src\\main\\java\\io\\dosya\\people.txt");
            ObjectInputStream os = new ObjectInputStream(fi);

            personList = (List<Person>) os.readObject();
            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return personList;
    }
}