// public class novarags {
//     public double Average(int a , int b ) 
//     {
//         return (double)(a+b)/2;
//     }
//     public double Average(int a, int  b ,int c){
//         return (double)(a+b+c)/3;
//     }
//     public static void main(String args[]){
//         novarags obj=new novarags();
//         System.out.println(obj.Average(3,4));
//         System.out.println(obj.Average(3,4,7));
//         System.out.println(obj.Average(3,4));
//         System.out.println(obj.Average(3,4));
//     }
// }
class novarags
{
    public double Average(int...numbers){
        int sum =0;
        for(int i:numbers) 
        {
            sum+=i;
        }
        return number.length==0? 0: (double)sum/numbers.length;
    }
    public static void main(String[] args) {
        varags obj=new varags();
        System.out.println(obj.Average(3,4));
    }
}