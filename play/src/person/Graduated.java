package person;

public class Graduated extends Students {
    double generalGPA;
    int yearOfGrad;

    public Graduated() {
        System.out.println("I'm a graduate Student :)");
    }

    public Graduated(String name, double age, String address, String nationality, int studyLevel,
                     String specialization, double gpa, int yearOfGrad) {
        super(name, age, address, nationality, studyLevel, specialization, gpa);
        this.yearOfGrad = yearOfGrad;
    }

    @Override
    public void setGpa(double gpa) {
        generalGPA = gpa * 4;
    }

    /*@Override
    public void print( ) {
        super.print();
        System.out.println("General GPA: " + generalGPA + "\nYear of Graduation: " + yearOfGrad);
    }*/
}
