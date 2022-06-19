package Main;

public class Employee implements ISalary, IName, IEmployee {

    private double baseSalary;
    private String name;
    private int age;
    private char gender;

    public Employee(double baseSalary, String name, int age, char gender) {
        this.baseSalary = baseSalary;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Employee(double baseSalary, String name) {
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public double getSalary() {
        return 0;
    }
}