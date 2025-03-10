import java.util.*;
public class MulUsingFunction {
    public static int checkProdduct(int a, int b){
      int  product= a * b ;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter The Second Number: ");
        int b = sc.nextInt();
       int  product = checkProdduct(a, b);
        System.out.println("The product of The Given Two nummber is " + product);
        
    }
}
