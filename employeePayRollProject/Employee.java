package employeePayRollProject;

public abstract class Employee {
    private String name;
    private int id;
    private static double ctc = 450000;
    private static double hourlyRate = 100;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getCtc() {
        return ctc;
    }

    public static double getHourlyRate() {
        return hourlyRate;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee [ name = " + name + " , id = " + id + " , Salary = " + calculateSalary() + " ]";
    }
}
