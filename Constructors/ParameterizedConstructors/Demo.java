package Constructors.ParameterizedConstructors;

public class Demo {
    // Parameterized constructors refers to Constructor with argument list.
    // Parameterized constructors take input parameters on creation of ojects.
    // If we define only parameterized constructor, then we cannot create an object with default constructor.

    public Demo(String message){
        System.out.println("This is a parameterized constructor. " + message);
    }

    public static void main(String[] args) {
        Demo demo = new Demo("Welcome to TCS Xplore Java Training.");
        System.out.println("This is the main method." + " The parameterized constructor is called when we create an object of the class." + demo);
    }
}
