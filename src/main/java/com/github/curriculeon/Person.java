package com.github.curriculeon;

/**
 * Created by leon on 12/16/2019.
 */
public class Person {
    String firstName;
    String lastName;
    public Person(){
        this.firstName ="";
        this.lastName = "";
    }

    public Person(String firstName, String lastName) {
        setFirstName(firstName);
       setLastName(lastName);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
