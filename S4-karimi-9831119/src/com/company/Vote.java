package com.company;

/**
 * contain data of votter + time of voting
 * @author Mohammad Reza Karimi
 * @version 1.0
 *
 */
public class Vote {
    private Person person;
    private String date;

    /**
     *
     * main contractor
     * @param person
     * @param date
     */
    public Vote(Person person,String date){
        this.person=person;
        this.date=date;
    }

    /**
     * returning datil of peron
     *
     * @return person
     */
    public Person getPerson(){
        return person;
    }

    /**
     * return time of vote
     * @return
     */
    public String getDate(){
        return date;
    }




}
