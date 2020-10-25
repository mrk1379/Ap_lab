package com.company;

import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * this class set the votes
 * check if person have voted before
 * contains a method to print the voting details
 * contain getter methods used in voting system class
 * @author Mohammad Reza Karimi
 * @version 1.0
 */
public class Voting {
    //fields
    private int type;
    private String question;
    private ArrayList<Person> voters ;
    private HashSet<Vote> listOfvotes;
    //this hashmap is used to vheck if prson have voted before
    private HashMap<String,HashSet<Vote>> votesTochoices;
    private ArrayList<String> choices;
   // private int firstvotter = 0;

    //using library for getting the current date in shamsi format
    JalaliCalendar mycalender = new JalaliCalendar();

    /**
     * main constractor
     * we add a fake hash to votetochoices so we can have data of each choice
     * @param type
     * @param question
     * @param choices
     */
    public Voting(int type,String question,ArrayList<String> choices){
        this.type=type;
        this.question=question;
        this.choices=choices;

        voters = new ArrayList<>();
        votesTochoices = new HashMap<>();


        for (String example : choices) {

            HashSet hash = new HashSet();
            votesTochoices.put(example, hash);
        }

    }

    /**
     *
     * this method is for adding choices
     * @param choice
     */

    public void creatChoice (String choice){

        choices.add(choice);

    }

    /**
     *
     * @return type of voting for number of possibe choices
     */
    public int getType() {
        return type;
    }

    /**
     *
     * @return voters
     */
    public ArrayList<Person> getVoters() {
        return voters;
    }

    /**
     * adding voted
     * checking if person voted before
     * @param newVotingperson
     * @param choices
     */
    public void voteAdding(Person newVotingperson,ArrayList<String> choices){
        //for checking if person is in voters list
        int check = 0;

        for (Person newVoter:voters) {
            if (newVoter.getFirstName().equals(newVotingperson.getFirstName()) && newVoter.getLastName().equals(newVotingperson.getLastName())) {
                check = 1;

            }
        }

            if(check==1){
                System.out.println("cant vote twice");
            }else{
                //making a fake vote for ading to the main one
                Vote addingvote = new Vote(newVotingperson,mycalender.toString());

                for (String choice:choices) {
                    if(choice.equals("Random")){

                        Random myrandom =new Random();
                        int x;
                        x=myrandom.nextInt(choices.size());
                        String bank = choices.get(x);
                        votesTochoices.get(bank).add(addingvote);
                    }else if(votesTochoices.containsKey(choice)){

                        votesTochoices.get(choice).add(addingvote);
                    }
                }


                voters.add(newVotingperson);

            }




    }

    /**
     * method for printin
     * 1- number of vote to each option
     * 2- name of voter for each option and the time of voting
     */
    public void printVotes(){

        for (String choice:choices) {

            if (votesTochoices.containsKey(choice)){

                System.out.println("number of votes for choice "+choice +" ="+ votesTochoices.get(choice).size());
                System.out.println("voters for above option");
                for (Vote example:votesTochoices.get(choice)) {
                    System.out.println(example.getPerson().getFirstName() + " " + example.getPerson().getLastName() +" in " + example.getDate());
                    
                }
            }
        }
    }

    /**
     *
     * @return the question
     */
    public String getQuestion(){
        return  question;
    }

    /**
     *
     * list of choces
     * @return
     */
    public ArrayList<String> getChoices(){
        return choices;
    }

}
