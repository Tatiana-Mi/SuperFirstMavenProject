package Main;

public class Worker extends Employee implements ISalary, IName{

    public Worker(double baseSalary, String name){
        super(baseSalary, name);

    }

    @Override
    public double getSalary() {
        return super.getBaseSalary();
    }
}
