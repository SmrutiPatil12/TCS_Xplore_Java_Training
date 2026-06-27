package Constructors.DefaultConstructors;

public class Demo {
    public Demo(){
        System.out.println("This is a default constructor.");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println("This is the main method." + " The default constructor is called when we create an object of the class." + demo);
    }
}
