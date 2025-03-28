import java.util.Scanner;
public class ArrayUsingLoop {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();  
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();  
    }

    for (int num : arr) {
        System.out.print(num + " ");  
    }

    sc.close();
}
}

