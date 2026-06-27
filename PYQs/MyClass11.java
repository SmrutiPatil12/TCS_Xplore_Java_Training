package PYQs;
import java.util.Scanner;
public class MyClass11 {

    public static String Solution(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i< str.length(); i=i+2){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();

        System.out.println(Solution(str));
        sc.close();
    }
}
