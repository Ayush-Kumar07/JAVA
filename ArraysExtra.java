import java.util.Scanner;
public class ArraysExtra{
    int a[][]= new int[2][3];
    Scanner input=new Scanner(System.in);
    for(int i = 0; i<a.length;i++){
        for(int j = 0;j<a[i].length;j++)
        {
            a[i][j]=input.nextInt();
        }
    }
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            System.out.println(a[i][j]+" ");
        }
        System.out.println();
    }
}

