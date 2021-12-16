package person;

import javax.swing.*;

public class Students extends Person {
    public static void main(String[] args) {

        Graduated g1 = new Graduated() ;
        g1 = new Graduated("Omer", 20, "Aga", "Bilqas", 12, "Hack", 1.4, 2025);
        g1.setGpa(1.4);
        g1.print();



    }

    int studyLevel;
    double gpa;
    String specialization;

    public Students() {
        System.out.println("I'm the Dreived class constructor !");
    }

    public Students(String name, double age, String address, String nationality, int studyLevel, String specialization, double gpa) {
        super(name, age, address, nationality);
        this.studyLevel = studyLevel;
        this.specialization = specialization;
        this.gpa = gpa;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void  setGpa(double gpa) {
        this.gpa = gpa ;
    }

    public void setStudyLevel(int studyLevel) {
        this.studyLevel = studyLevel;
    }

    public int getStudyLevel() {
        return studyLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public String getSpecialization() {
        return specialization;
    }
}
