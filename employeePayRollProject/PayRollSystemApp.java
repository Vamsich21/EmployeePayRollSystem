package employeePayRollProject;
import java.util.Scanner;

public class PayRollSystemApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayRollSystem payRollSystem = new PayRollSystem();
        
        System.out.println("Enter Number of Employees You Want to Add:");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < numberOfEmployees; i++) {  
            System.out.println("\n--- Enter details for Employee " + (i + 1) + " ---");

            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Employee Type as Shown (FullTime or PartTime): ");
            String employeeType = scanner.nextLine().trim();
            employeeType = employeeType.replaceAll("\\s+", "");

            if (employeeType.equalsIgnoreCase("FullTime")) {
                FullTimeEmployee fullTimeEmp = new FullTimeEmployee(name, id);
                payRollSystem.addEmployee(fullTimeEmp);
            } 
            else if (employeeType.equalsIgnoreCase("PartTime")) {
                System.out.print("Enter Number of minutes worked (e.g., instead of 1:30 hr enter 90): ");
                double minutes = scanner.nextDouble();
                scanner.nextLine();

                double hours = minutes / 60.0;
                PartTimeEmployee partTimeEmp = new PartTimeEmployee(name, id, hours);
                payRollSystem.addEmployee(partTimeEmp);
            }
            else {
                System.out.println("Invalid Employee Type entered. Skipping this employee.");
            }
        }

        System.out.println("\n=== Initial Employee Details ===");
        payRollSystem.displayEmployees();

        System.out.print("\nEnter Employee ID to remove an employee: ");
        int empId = scanner.nextInt();
        scanner.nextLine();

        boolean removed = payRollSystem.removeEmployee(empId);
        if (removed) {
            System.out.println("Employee with ID " + empId + " has been removed.");
        } else {
            System.out.println("Employee with ID " + empId + " not found.");
        }

        System.out.println("\n=== Remaining Employee Details ===");
        payRollSystem.displayEmployees();

        scanner.close();
    }
}
