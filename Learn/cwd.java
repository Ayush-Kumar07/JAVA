public class cwd {
    public static void main(String[] args) {
        // int[] marks = new int[5];
        // marks[0]=7;
        // marks[1]=72;
        // marks[2]=47;
        // marks[3]=447;
        // marks[4]=700;
        // System.out.println("marks"+marks);
        int[] marks = {100,20,60,45,44};
        System.out.println("Printing Using Loops");
        for(int i=0; i<5;i++){
            System.out.println(marks[i]);
        }
        //Displaying the Array (for loop) in Reverse order 
        System.out.println("Printing the array in reverse Order");
        for(int i=marks.length -1; i>=0; i--){
            System.out.println(marks[i]);
        }
        //using for-each loop for printing the Array  
        for(int element: marks){
            System.out.println(element);
        }
        // System.out.println(marks[2]);
    }
}
