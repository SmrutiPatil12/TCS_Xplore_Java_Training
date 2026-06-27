package PYQs;
import java.util.Scanner;
public class MyClass12 {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0,x;
        while(n!=0){
            x = n%10;
            sum = sum + x;
            n = n/10;
        } 
        if(sum%3 == 0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
}
/*PS F:\TCS_Xplore_Java_Training> javac .\PYQs\MyClass12.java 
PS F:\TCS_Xplore_Java_Training> java PYQs.MyClass12
123
True */