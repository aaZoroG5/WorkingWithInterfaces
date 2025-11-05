package com.pluralsight;

import java.util.Collections;
//NOTE: remember to change the default object, Comparable<T>, into the one you're comparing
//in this case it would be Comparable<Person>
public class Person implements Comparable<Person> {

    //properties
    private String firstName;
    private String lastName;
    private int age;

    //constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //getters/setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        //why int?
        int last = this.lastName.compareTo(p.lastName);
        return last == 0 ? this.firstName.compareTo(p.firstName) : last;
    }

}
