// import java.util.Scanner;
//  public class _04_TakingInput {
//     public static void main(String[] args) {
//          System.out.println("Taking input from the user: ");
//          Scanner sc= new Scanner(System.in);
//          System.out.println("Enter number 1 : "); 
//          int a = sc.nextInt();
//          System.out.println("Enter number 2 : "); 
//          int b = sc.nextInt();
//          int sum = a + b;
//          System.out.println("The sum of these number is "+sum);
//         //  System.out.println(sum);
//     }
// }
// import java.util.Scanner;
// public class _04_TakingInput {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the 1st number : ");
//     int a = sc.nextInt();
//     System.out.println("Enter the 2nd number : ");
//     int b = sc.nextInt();
//     int sum = a + b ;
//     System.out.println("The sum of these numbers is : "+sum);
// }
    
// }




















import java.util.Scanner;
public class _04_TakingInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter value of a:  ");
        int a = sc.nextInt();
        System.out.println("Enter value of b: ");
        int b = sc.nextInt();
        int sum = a + b ;
        System.out.println("The sum of the both values will be: " + sum);
    }
}