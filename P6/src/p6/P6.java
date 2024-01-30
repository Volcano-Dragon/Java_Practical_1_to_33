package p6;
import java.util.Scanner;

public class P6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\nDistance Converter:");
            System.out.println("1. Kilometers to Miles");
            System.out.println("2. Miles to Kilometers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter distance in kilometers: ");
                    double km = sc.nextDouble();
                    double miles = km * 0.621371;
                    System.out.printf("%.2f kilometers is equal to %.2f miles.\n", km, miles);
                    break;
                case 2:
                    System.out.print("Enter distance in miles: ");
                    double miles2 = sc.nextDouble();
                    double km2 = miles2 * 1.60934;
                    System.out.printf("%.2f miles is equal to %.2f kilometers.\n", miles2, km2);
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting Distance Converter.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid number (1-3).");
            }
        }
    }
}
