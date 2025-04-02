import java.nio.channels.Pipe.SourceChannel;

class Prabh{
    public static void main(String[] args){
        try{
            System.out.println("Learn");
            int a=20, b=0, c;
            c=a/b;
            System.out.println(c);
            System.out.println("like");
        }
        catch(Exception e)
        {
            int x=20, y=0 , z;
            z=x/y;
            System.out.println(z);
            System.out.println("cannot divide by zero");
        }
        finally{
            System.out.println("share");
        }
        System.out.println("main method ended");
    }
}