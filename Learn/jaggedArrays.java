import java.util.Scanner;
public class jaggedArrays {
    public static void main(String[] args) {
        int a[][]=new int[3][];
        a[0]=new int[3];
        a[1]=new int[4];
        a[2]=new int[2];
        Scanner input=new Scanner(System.in);
        for(int i=0; i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++){
                a[i][j]=input.nextInt();
            }
        }
        for(int i=0; i<a[i].length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] +" ");

            }
            System.out.println();
        }
    }
}
