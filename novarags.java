public class novarags {
    public double Average(int a , int b ) 
    {
        return (double)(a+b)/2;
    }
    public double Average(int a, int  b ,int c){
        return (double)(a+b+c)/3;
    }
    public static void main(String args[]){
        novarags obj=new novarags();
        System.out.println(obj.Average(3,4));
        System.out.println(obj.Average(3,4,7));
        System.out.println(obj.Average(3,4));
        System.out.println(obj.Average(3,4));
    }
}
