package employeePayRollProject;

public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id) {
        super(name, id);
        this.monthlySalary = getCtc() / 12;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
