import java.util.Scanner;

public class PulleySystemCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("===== Pulley System Calculator =====");
        System.out.println("Choose an option:");
        System.out.println("1. Calculate RPM of second pulley");
        System.out.println("2. Calculate weight that can be lifted");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = input.nextInt();
        
        if (choice == 1) {
            // Part A: Calculate RPM2
            System.out.println("\n--- Calculate RPM of Second Pulley ---");
            System.out.print("Enter diameter of first pulley (diameter1): ");
            double diameter1 = input.nextDouble();
            System.out.print("Enter diameter of second pulley (diameter2): ");
            double diameter2 = input.nextDouble();
            System.out.print("Enter RPM of first pulley (RPM1): ");
            double RPM1 = input.nextDouble();
            
            // Formula: RPM2 = (diameter1 / diameter2) * RPM1
            double RPM2 = (diameter1 / diameter2) * RPM1;
            
            System.out.println("\n===== Result =====");
            System.out.println("Diameter of Pulley 1: " + diameter1);
            System.out.println("Diameter of Pulley 2: " + diameter2);
            System.out.println("RPM of Pulley 1: " + RPM1);
            System.out.println("RPM of Pulley 2: " + RPM2);
            System.out.println("==================");
        } else if (choice == 2) {
            // Part B: Calculate weight lifted
            System.out.println("\n--- Calculate Weight Lifted ---");
            System.out.print("Enter force exerted (in pounds or kg): ");
            double forceExerted = input.nextDouble();
            System.out.print("Enter number of up ropes: ");
            int numberOfRopes = input.nextInt();
            
            // Formula: weight lifted = force exerted * number of up ropes
            double weightLifted = forceExerted * numberOfRopes;
            
            System.out.println("\n===== Result =====");
            System.out.println("Force Exerted: " + forceExerted);
            System.out.println("Number of Up Ropes: " + numberOfRopes);
            System.out.println("Weight that can be lifted: " + weightLifted);
            System.out.println("==================");
        } else {
            System.out.println("Invalid choice! Please run the program again.");
        }
        
        input.close();
    }
}