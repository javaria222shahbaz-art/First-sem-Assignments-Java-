import java.util.Scanner;

public class WindChillCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input
        System.out.print("Enter temperature (t) in Fahrenheit: ");
        double t = input.nextDouble();
        System.out.print("Enter wind speed (v) in miles per hour: ");
        double v = input.nextDouble();
        
        // Wind chill formula
        // w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * v^0.16
        double windChill = 35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * Math.pow(v, 0.16);
        
        // Output
        System.out.println("\n===== Wind Chill Report =====");
        System.out.println("Temperature: " + t + "°F");
        System.out.println("Wind Speed: " + v + " mph");
        System.out.println("Wind Chill: " + windChill + "°F");
        System.out.println("=============================");
        
        input.close();
    }
}