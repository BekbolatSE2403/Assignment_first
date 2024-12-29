package modules;

import java.util.ArrayList;

public class Student extends Person {
    private static int idCounter = 1;
    private int studentID;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student (String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        setID(idCounter);
        setGrades(grades);
    }

    public int getID(){
        return studentID;
    }

    public void setID(int id){
        this.studentID = idCounter++;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double calculateGpa(){
        int s = 0;
        for(Integer grade : grades){
            s += grade;
        }
        return (s/(double)grades.size())*0.04;
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + " and me GPA is " + calculateGpa();
    }

}
