// Java program to count the number of small and capital letters in a string
package PYQs;
import java.util.Scanner;
public class MyClass6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        int s_count =0, c_count = 0;

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                s_count++;
            }
            else if(Character.isUpperCase(ch)){
                c_count++;
            }
        }
        System.out.println("Number of small letters in the string : " + s_count);
        System.out.println("Number of capital letters in the string : " + c_count);
        sc.close();
    }
}
/*PS F:\TCS_Xplore_Java_Training> javac .\PYQs\MyClass6.java 
PS F:\TCS_Xplore_Java_Training> java PYQs.MyClass6
Enter a string :
i I am a student 
Number of small letters in the string : 11
Number of capital letters in the string : 1 */