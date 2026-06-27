// Java program to find the index of a character in a string
// Example :
// Input :
// Enter a string : Hello World
// Enter a character to find : o
// Output :
// Character o is found at index : 4

package PYQs;
import java.util.*;
public class MyClass3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("Enter a character to find : ");
        char ch = sc.next().charAt(0);
        // sc.next() returns a String, 
        // but we need a single character. 
        // charAt(0) extracts the first character 
        // from that String.
        // Example:
        // sc.next()      -> "r"
        // charAt(0)      -> 'r'

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                System.out.println("Character " + ch + " is found at index : " + i);
                break;
            }
        }
        sc.close();
    }
}
/*PS F:\TCS_Xplore_Java_Training> java PYQs.MyClass3
Enter a string : 
Smruti
Enter a character to find : 
r
Character r is found at index : 2 */