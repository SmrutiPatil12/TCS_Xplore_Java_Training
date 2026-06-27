package PYQs;
/* Write a program to print the  last character  of  every word in a string

Conditions : Ignore all digits and whitespaces 
Input : Hey3 Java Learners
Output : as*/
import java.util.Scanner;
public class MyClass8 {
    public static String Solution(String str){
        StringBuilder sb = new StringBuilder();

        String words[] = str.split(" ");
        for(int i = 0; i<words.length; i++){
            String word = words[i];
                char ch = word.charAt(word.length()-1);
                if(Character.isLetter(ch)){
                    sb.append(ch);
                }
        }
        return sb.toString();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println(Solution(str));

        sc.close();
    }
}
