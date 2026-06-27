package Constructors.ConstructorOverloading;

public class Demo {
    public Demo(){
        System.out.println("This is a default constructor.");
    }
    public Demo(String message){
        System.out.println("This is a parameterized constructor. " + message);
    }
    
    public static void main(String[] args) {
        Demo demo1 = new Demo();
        System.out.println("This is the main method." + " The default constructor is called when we create an object of the class." + demo1);

        Demo demo2 = new Demo("Welcome to TCS Xplore Java Training.");
        System.out.println("This is the main method." + " The parameterized constructor is called when we create an object of the class." + demo2);
    }
}
