class ABC {
    int b= 20 ;
    static int a=5;
    void disp2(){
        System.out.println("hello");

    }
    static void disp(){
        System.out.println("Inside Static Nested Class "+b);
        System.out.println("Inside Static Nested Class "+a);
        disp();
        disp2();
    }
}