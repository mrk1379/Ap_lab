package com.company;

/**
 * @author MohanmmadReza Karimi
 * @version 1.0
 * Student class
 * base info of student
 * contain methods for changing or stting the student info
 * contain method to print students info
 *
 */
public class Student {
    private String firstName;
    private String lastName;
    private int id;
    private String degree;
    private int grade;

    /**
     * constructor of student class ,setting the input data of students
     *
     * @param firsName
     * @param lastname
     * @param id
     * @param degree
     * @param grade
     */
    public Student(String firsName, String lastname, int id,String degree,int grade){
        this.grade = grade;
        this.firstName = firsName;
        this.lastName = lastname;
        this.id = id;
        this.degree=degree;
        this.grade=grade;

    }

    /**
     * method for getting grades
     * @return
     */
    public int getGrade(){
        return grade;

    }

    /**
     * method for swtting grades
     * @param grade
     */
    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     * method for getting student first name
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * method for setting student last name
     * @param fName
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }

    /**
     * method for stting a new grade for studs
     * @param degree
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * method for setting a new id for studs
     * @param id
     */
    public void setId(int id){
        this.id = id;
    }

    /**
     * method for printing students info
     */
    public void print() {
        System.out.println("name: "+firstName + "  lastname: " +lastName+ "  ID: "+ id + "  degree: "+ degree);
    }


}
