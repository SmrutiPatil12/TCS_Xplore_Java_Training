// Java program to remove duplicates from a string
// Example :
// Input :
// Enter a string : experience
// Output :
// String after removing duplicates : exprinc
package PYQs;
import java.util.Scanner;
public class MyClass5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();

        System.out.println("String after removing duplicates : " + Solution.removeDuplicates(str));
        Solution.removeDuplicates(str);

        sc.close();
    }
}
class Solution{
    public static String removeDuplicates(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(sb.indexOf(String.valueOf(ch)) == -1){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
/*PS F:\TCS_Xplore_Java_Training> java PYQs.MyClass5        
Enter a string :
experience
String after removing duplicates : exprinc
String after removing duplicates : exprinc */

// String builder 
/*sb = ""

e -> "e"

x -> "ex"

p -> "exp"

e -> already present

r -> "expr"

i -> "expri"

e -> already present

n -> "exprin"

c -> "exprinc"

e -> already present 
Output : exprinc
StringBuilder is a mutable sequence of characters used to efficiently modify strings without creating new objects repeatedly.
Difference Between String and StringBuilder
String	StringBuilder
Immutable	Mutable
Slow for modifications	Faster
New object created	Same object modified
*/