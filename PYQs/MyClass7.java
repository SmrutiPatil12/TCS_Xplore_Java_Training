package PYQs;
/* Write a program to compute the number of spaces and characters in a string.
    Input : Hi I am a student
    Output :  4 13 */
import java.util.Scanner;
public class MyClass7 {
    public static String countSpacesAndCharacters(String str){
        int spaceCount = 0, charCount = 0;
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                spaceCount++;
            }else{
                charCount++;
            }
        }
        return spaceCount + " " + charCount;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();

        System.out.println(countSpacesAndCharacters(str));

        sc.close();
    }

}
/*PS F:\TCS_Xplore_Java_Training> javac .\PYQs\MyClass7.java 
PS F:\TCS_Xplore_Java_Training> java PYQs.MyClass7
Enter a string :
Hi I am a Student
4 13 */