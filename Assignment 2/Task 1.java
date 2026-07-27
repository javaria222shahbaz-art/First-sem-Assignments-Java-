import java.util.Scanner;

public class TCSBoxesSalesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Constants
        final int BOXES_PER_CARTON = 12;
        final double REGULAR_PRICE = 1.14;
        final double DISCOUNT_PRICE = 0.57;
        
        // Input
        System.out.print("Enter the total number of boxes produced: ");
        int totalBoxes = input.nextInt();
        
        // Calculations
        int fullCartons = totalBoxes / BOXES_PER_CARTON;
        int leftoverBoxes = totalBoxes % BOXES_PER_CARTON;
        int fullBoxesSold = fullCartons * BOXES_PER_CARTON;
        
        // Revenue calculations
        double revenueFromFullBoxes = fullBoxesSold * REGULAR_PRICE;
        double revenueFromLeftovers = leftoverBoxes * DISCOUNT_PRICE;
        double totalRevenue = revenueFromFullBoxes + revenueFromLeftovers;
        
        // Output
        System.out.println("\n===== TCS Boxes Sales Report =====");
        System.out.println("Full boxes sold at regular price: " + fullBoxesSold);
        System.out.println("Number of cartons sold: " + fullCartons);
        System.out.println("Leftover boxes sold at discount: " + leftoverBoxes);
        System.out.println("Revenue from full boxes: $" + revenueFromFullBoxes);
        System.out.println("Revenue from leftover boxes: $" + revenueFromLeftovers);
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.println("==================================");
        
        input.close();
    }
}