import java.util.Scanner;

public class LoanEligibilityChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input
        System.out.print("Enter your monthly income: $");
        double monthlyIncome = input.nextDouble();
        System.out.print("Enter your total monthly expenses: $");
        double monthlyExpenses = input.nextDouble();
        
        // Eligibility criteria
        // 1. Monthly income should be at least 3 times the total monthly expenses
        // 2. Monthly income should be greater than $1000
        boolean criteriaOne = monthlyIncome >= (3 * monthlyExpenses);
        boolean criteriaTwo = monthlyIncome > 1000;
        
        // Output
        System.out.println("\n===== Loan Eligibility Result =====");
        System.out.println("Monthly Income: $" + monthlyIncome);
        System.out.println("Monthly Expenses: $" + monthlyExpenses);
        
        if (criteriaOne && criteriaTwo) {
            System.out.println("\nCongratulations! You are ELIGIBLE for a loan.");
        } else {
            System.out.println("\nSorry, you are NOT ELIGIBLE for a loan.");
            if (!criteriaOne) {
                System.out.println("Reason: Your income is less than 3 times your expenses.");
            }
            if (!criteriaTwo) {
                System.out.println("Reason: Your monthly income is not greater than $1000.");
            }
        }
        System.out.println("===================================");
        
        input.close();
    }
}