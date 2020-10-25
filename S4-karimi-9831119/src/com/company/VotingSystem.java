package com.company;

import java.util.ArrayList;

/**
 * voting system class
 * creat votting and contain arreylist of all current votin
 * @author Mohammad Reza Karimi
 * @version 1.0
 */
public class VotingSystem {
    //for storing votings
    private ArrayList<Voting> votingList = new ArrayList<>();

    //no main contractor is needed
    public VotingSystem(){}

    /**
     *
     * creat new voting using recived data
     * @param type  1 for 1 coice and 2 for mutiple choices
     * @param question
     * @param choices
     */
    public void creatVoting(int type,String question,ArrayList<String> choices){
        Voting newvoting = new Voting(type,question,choices);
        votingList.add(newvoting);
    }

    /**
     *
     * printing question and choices of polls
     */
    public void printListOfvoting(){
        for (Voting votingListForloop:votingList) {
            System.out.println(votingListForloop.getQuestion());
            System.out.println(votingListForloop.getChoices());
        }

    }

    /**
     *
     *  for checking if number of choices matches the the type of voting
     *  and then adding votes
     * or showing proper massage
     * @param number  (in Array list)
     * @param person
     * @param choices
     */
    public void vote(int number,Person person,ArrayList<String> choices){

        if(votingList.get(number).getType()==1){

            if(choices.size()!=1){
                System.out.println("maximum number of choices in this voting is 1");
            }else if(choices.size()==1){

                votingList.get(number).voteAdding(person,choices);
            }
        }else   {

            votingList.get(number).voteAdding(person,choices);
        }

    }

    /**
     * using method from votting class
     * printing the detail of wanted voting list
     * @param numer
     */

    public void printResoult(int numer){

        votingList.get(numer).printVotes();
    }

    public void addOption(int number,String choice){
        votingList.get(number).creatChoice(choice);
    }

}
