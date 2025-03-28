public class _07_NestedTernary {
    public static void main(String[] args) {
        int a = 12 ;
        int b = 20 ;
        int c = 30 ;
        int d = (a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(d);

    }
}
