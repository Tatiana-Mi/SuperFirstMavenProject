package Main;

public class Main1 {
    public static void main(String[] args) {
        Worker worker  = new Worker(1000, "Anna");
        Employee employee = new Employee(10000, "Olga", 38, 'F');

        ISalary salaryW = worker;
        ISalary salaryE = employee;

        IName nameW = worker;
        IName nameE = employee;

        System.out.println(salaryE.getSalary());
        System.out.println(salaryW.getSalary());

        System.out.println(nameE.getName());
        System.out.println(nameW.getName());

    }
}

