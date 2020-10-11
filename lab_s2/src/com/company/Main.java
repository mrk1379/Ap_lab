package com.company;

/**
 * the main class of project
 * setting college cap and adding 2 stud + 2 academic staff(1 is more than cap)
 * print stud detail
 * print college avg
 *
 * @author Mohammad Reza Karimi
 * @version 1.0
 * @since 2020-10-9
 *
 */
public class Main {
/**
 * @param args
 */
    public static void main(String[] args) {

        College myCollege = new College(1,3);
        Student stud1 = new Student("Mohammad","karimi",9831119,"bachlor",18);
        Student stud2 = new Student("ali","nami",9817456,"master",20);
        AcademicStaff  aS1= new AcademicStaff("Ali","Nori");
        AcademicStaff  aS2= new AcademicStaff("Iraj","Bagheri");
/**
 * using method set grade to change the grade of stud2
 */
        stud2.setGrade(14);

        //adding stud and as
        myCollege.enrollStudent(stud1);
        myCollege.enrollStudent(stud2);
        myCollege.enrollStaff(aS1);
        myCollege.enrollStaff(aS2);

        //print detail of stud1
        stud1.print();
        //setting as1 rank
        aS1.setRank("danesh yar");
        //print avg of college using calecAvg method from class College

       System.out.println(myCollege.calecAvg());


    }
}
