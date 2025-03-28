import java.util.*;

public class FactorialUsingFun {
    public static void factorialNum(int a) {
        int factorial = 1;
        for (int i = a; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        factorialNum(n);
        sc.close(); // Close Scanner to prevent resource leaks
    }
}
