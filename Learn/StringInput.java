import java.util.*;

public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        
        System.out.println("My name is: " + name);
        
        sc.close(); // Best practice
    }
}
