package com.company;

/**
 * class of college
 * for adding student or academic staff
 * contain method for calculating avg of grades
 * contain functain to recall if the maximum number of studens or staff is reached
 * @author MohammadReza Karimi
 * @version 1.0
 *
 *
 */

public class College {

    private Student[] students;
    private AcademicStaff[] academicStaffs;
    private int numberStudent;
    private int numberStaff;
    private int capacityStud;
    private int capacityStaff;
    private int avgOfCollege;

    /**
     * constructor
     * @param capacityStaff
     * @param capacityStud
     */
   public College(int capacityStaff,int capacityStud){
       this.students = new Student[capacityStud];
       this.academicStaffs = new AcademicStaff[capacityStaff];
       this.capacityStaff = capacityStaff;
       this.capacityStud=capacityStud;
       numberStudent=0;
       numberStaff = 0;
   }

    /**
     * adding student
     * @param student
     */
   public void enrollStudent(Student student){

            if(numberStudent<capacityStud){
                students[numberStudent] = student;
                numberStudent++;
            }else{
                System.out.println("max number !! cant add more student");
            }
   }

    /**
     * adding academic staff
     * checking cap for max number
     * @param academicStaff
     */

   public void enrollStaff(AcademicStaff academicStaff){
       if(numberStaff<capacityStaff){
           academicStaffs[numberStaff] = academicStaff;
            numberStaff++;

       }else{
           System.out.println("max number !! cant add more academic staff");
       }

   }

    /**
     * calculating avg grade of students in this college
     * @return int average number of students grades
     */

    public int calecAvg(){
       int sumOfgrades=0;
       for(int counter =0;counter<numberStudent;counter++){
           sumOfgrades = students[counter].getGrade() + sumOfgrades;
       }
     this.avgOfCollege = (sumOfgrades/numberStudent);
       return this.avgOfCollege;
   }



}
