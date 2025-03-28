class Employe {
    String name;
    int salary;
    int uid;
    Employe() {
        System.out.println("Default Constructor Called");
    }

    Employe(String name, int salary, int uid) {
        System.out.println(name + " " + salary + " " + uid);
    }

    public static void main(String[] args) {
        Employe p = new Employe(); 
        Employe p1 = new Employe("prabh", 100000, 13); 
}