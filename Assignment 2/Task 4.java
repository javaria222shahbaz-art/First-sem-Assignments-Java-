import java.util.Scanner;

public class RGBtoCMYK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input RGB values (0-255)
        System.out.print("Enter Red (R) value (0-255): ");
        int R = input.nextInt();
        System.out.print("Enter Green (G) value (0-255): ");
        int G = input.nextInt();
        System.out.print("Enter Blue (B) value (0-255): ");
        int B = input.nextInt();
        
        // Variables for CMYK
        double C, M, Y, K;
        
        // Check if all RGB values are 0 (black)
        if (R == 0 && G == 0 && B == 0) {
            C = 0.0;
            M = 0.0;
            Y = 0.0;
            K = 1.0;
        } else {
            // Normalize RGB values to range 0.0 - 1.0
            double r = R / 255.0;
            double g = G / 255.0;
            double b = B / 255.0;
            
            // Calculate white (W)
            double W = Math.max(r, Math.max(g, b));
            
            // Calculate CMYK values
            C = (W - r) / W;
            M = (W - g) / W;
            Y = (W - b) / W;
            K = 1 - W;
        }
        
        // Output
        System.out.println("\n===== RGB to CMYK Conversion =====");
        System.out.println("RGB Values: (" + R + "," + G + "," + B + ")");
        System.out.println("CMYK Values:");
        System.out.println("Cyan (C): " + C);
        System.out.println("Magenta (M): " + M);
        System.out.println("Yellow (Y): " + Y);
        System.out.println("Black (K): " + K);
        System.out.println("==================================");
        
        input.close();
    }
}