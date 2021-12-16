package person;

public class Person {
    String name;
    double age;
    String address;
    String nationality;

    public Person() {
        System.out.println("I'm the Superclass constructor !");

    }

    public Person(String name, double age, String address, String nationality) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.nationality = nationality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getNationality() {
        return nationality;
    }

    public void print() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nAddress: " + address + "\nNationality: " + nationality);
    }
}
