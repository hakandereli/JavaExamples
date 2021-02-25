package io;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public class App {
    public static void main(String[] args) {
        Person person1 = new Person("hakan","dereli",111111111110l);
        Person person2 = new Person("atilla","test",2222222222220l);
        Person person3 = new Person("kaan","deneme",333333333330l);
        Person person4 = new Person("hasan","kara",4444444444440l);

        List<Person> personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);


        System.out.println("********* Yazılıyor ********");
        IoService ioService = new IoService();
        ioService.yazObject(personList);


        System.out.println("***** Okunuyor *******");
        List<Person> personList2= ioService.okuObject();
        for (Person p : personList2){
            System.out.println(p);
        }
    }
}
