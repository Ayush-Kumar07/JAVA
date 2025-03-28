import java.util.*;
public class ArrayQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        // System.out.println("Enter" +n "numbers:");
        for(int i = 0 ; i<n; i++){
            number[i]=sc.nextInt();

        }
        int min = number[0];
        int max = number[0];

        for(int i = 1 ; i < n ; i++){
            if(number[i]<  min){
                min=number[i];
            }
            if(number[i]> max){
                max=number[i];
            }
        }
        System.out.println("smallest Number: " +min);
        System.out.println("Largest Number: "+max);
    
    }
}
