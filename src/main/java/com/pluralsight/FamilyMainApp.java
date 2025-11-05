package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FamilyMainApp {

    public static void main(String[] args) {

        List<Person> myFamily = new ArrayList<Person>();
        myFamily.add( new Person("Dana", "Wyatt", 63) );
        myFamily.add( new Person("Zachary", "Westly", 31) );
        myFamily.add( new Person("Elisha", "Aslan", 14) );
        myFamily.add( new Person("Ian", "Auston", 16) );
        myFamily.add( new Person("Zephaniah", "Hughes", 9) );
        myFamily.add( new Person("Ezra", "Aiden", 17) );

//        test if list is made
//        System.out.printf("%s %s %d",myFamily.get(3).getFirstName(), myFamily.get(3).getLastName(), myFamily.get(3).getAge());

        //We can use the sort method because we have implemented the Comparable interface in our Person class
        //and added logic to the compareTo method
        Collections.sort(myFamily);

        //create a for each loop to print results
        //NOTE: for each loop structure: for(DataType variable : arrayOrCollection){}
        for(Person p:myFamily){
            System.out.printf("%s %s %d\n",p.getFirstName(), p.getLastName(), p.getAge());
        }

    }
}
