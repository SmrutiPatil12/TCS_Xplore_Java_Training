package PYQs;
import java.util.Scanner;
public class MyClass10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String words[] = str.split(" ");
        for(int i = 0; i<words.length; i++){

            String word = words[i];
            char ch = word.charAt(0);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                System.out.print(ch);
            }
        }
        sc.close();
    }
}
