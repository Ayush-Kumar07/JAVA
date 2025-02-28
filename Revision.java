import java.util.Scanner;

public class Revision {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        
        System.out.print("Enter Concert Name: ");
        String a = ab.nextLine();
        
        System.out.print("Enter Seat Number: ");
        int c = ab.nextInt();
        ab.nextLine(); // Consume newline

        System.out.print("Enter Ticket Price: ");
        double d = ab.nextDouble();
        ab.nextLine(); // Consume newline

        System.out.print("Is Available (true/false): ");
        boolean k = ab.nextBoolean();

        System.out.println("\nConcert Name: " + a);
        System.out.println("Seat Number: " + c);
        System.out.println("Ticket Price: " + d);
        System.out.println("Available: " + k);
        
        ab.close(); // Close Scanner to avoid resource leak
    }
}
