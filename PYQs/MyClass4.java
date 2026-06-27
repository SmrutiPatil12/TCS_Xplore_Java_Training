// Java program to count the number of small letters in a string
// Example :
// Input :
// Enter a string : Smruti
// Output :
// Number of small letters in the string : 5
package PYQs;

import java.util.Scanner;

public class MyClass4 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();

        int count = Solution.countSmallLetters(str);
        System.out.println("Number of small letters in the string : " + count);
        sc.close();
    }
}
class Solution{
    public static int countSmallLetters(String str){
        int smallCount = 0;

        for(int i = 0 ; i< str.length();i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                // Here you can also use Character.isLowerCase(str.charAt(i)) to check 
                // if the character is a small letter.
                smallCount++;
            }
        }
        return smallCount;
    }

}
/*PS F:\TCS_Xplore_Java_Training> javac .\PYQs\MyClass4.java 
PS F:\TCS_Xplore_Java_Training> java PYQs.MyClass4
Enter a string :
Smruti
Number of small letters in the string : 5 */