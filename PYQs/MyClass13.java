package PYQs;
/*Find a largest word from given string and if two words having same length print first one .
 */

import java.util.Scanner;
public class MyClass13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String words[] = str.split(" ");
        String largestWord = words[0];

        for(int i = 1; i<words.length; i++){
            String word = words[i];
            if(word.length() > largestWord.length()){
                largestWord = word;
            }
        }

        System.out.println(largestWord);
        sc.close();
    }
}
/*PS F:\TCS_Xplore_Java_Training> javac .\PYQs\MyClass13.java 
PS F:\TCS_Xplore_Java_Training> java PYQs.MyClass13
TCS is the best company ever 
company */