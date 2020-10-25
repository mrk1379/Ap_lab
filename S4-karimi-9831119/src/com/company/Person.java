package com.company;

/**
 * @author Mohammad Reza karimi
 * @version 1.0
 * class for person first and last name
 *
 */

public class Person {
    private String firstName;
    private String lastName;
    /**
     * main constractor
     * setting person first and last name
     * @param firstName
     * @param lastName
     */
    public Person(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;

    }
    /**
     * method to return first name of pesrson
     * @return firstName
     */
    public String getFirstName(){

    return firstName;
    }

    /**
     *method to return persons lastName
     *
     * @return lastName
     */

    public String getLastName(){
        return lastName;

    }
  //  public String toString(){}


    }
