package employeePayRollProject;

public class PartTimeEmployee extends Employee {
    private double hoursWorked;

    public PartTimeEmployee(String name, int id, double hoursWorked) {
        super(name, id);
        this.hoursWorked = hoursWorked;
    }

    
	@Override
    public double calculateSalary() {
        return hoursWorked * getHourlyRate();
    }
}
