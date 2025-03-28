// import java.lang.module.ModuleDescriptor.Builder;

public class Builder {
    String name ;
    Builder setName(String name) {
        this.name=name;
        return this;
    }
    void display(){
        System.out.println("Name: " +name);
    }
    public static void main(String[] args) {
        Builder b = new Builder();
        b.setName("Charlie").display();
    }
}
