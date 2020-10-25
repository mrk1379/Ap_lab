package com.company;


import java.util.ArrayList;

/**
 * main class
 * contains examples for testing the project and its functions
 * @author Mohammad Reza Karimi
 * @version 1.0
 *
 */

public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //we define 3 votters for testing purposes
        Person votter1=new Person("sara","nasr");
        Person votter2 =new Person("Mohammad","Karimi");
        Person votter3 =new Person("ali","shams");
        //define 2 ArrayList for choice
        ArrayList<String> choice = new ArrayList<>();
        ArrayList<String> multipleChoice = new ArrayList<>();
        //new object from vottingSystem
    VotingSystem myVotingSystem = new VotingSystem();


    // 2 choices contans the options of voting.we defined 4 option for testing purposos
        ArrayList<String> choices = new ArrayList<>();
        choices.add("Bahar");
        choices.add("Tabestan");
        choices.add("Paiiz");
        choices.add("Zemestan");
        ArrayList<String> choices1 = new ArrayList<>();
        choices1.add("a");
        choices1.add("b");
        choices1.add("c");
        choices1.add("d");

        //creating 2 new poll . 1 can get multiple choices .the other only one choice
        myVotingSystem.creatVoting(1,"Whats youre favorite season",choices);
        myVotingSystem.creatVoting(2,"Whats youre favorite season",choices);
        myVotingSystem.creatVoting(2,"favorite number",choices1);

        myVotingSystem.addOption(2,"Hichkodam");

        //printing question and choices of current polls
        myVotingSystem.printListOfvoting();

        //adding Bahar as choice
        choice.add("Bahar");

        // this choice contains multiple choices for testing voting more than 1 option
        multipleChoice.add("Bahar");
        multipleChoice.add("Tabestan");

        //first vote
        myVotingSystem.vote(0,votter1,choice);
        // same vote for checking if someone can vote twice
        myVotingSystem.vote(0,votter1,choice);
        //same poll this time checking if it accept multiple choice
        myVotingSystem.vote(0,votter2,multipleChoice);
        //checking if other type of pull can accept multiple choices
        myVotingSystem.vote(1,votter2,multipleChoice);

        System.out.println("resoults of first voting");
        //printing resoult of first vote containig (number of vote for each option + name and time of voting for each option)
        myVotingSystem.printResoult(0);
        //printing resoult of second vote containig (number of vote for each option + name and time of voting for each option)
        System.out.println("resoults of second voting");
        myVotingSystem.printResoult(1);


    }
}
