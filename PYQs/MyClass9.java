package PYQs;
/*Print the  number of spaces in the particular string.

    Input  : Hello what is your name
    Output : 4*/
    import  java.util.Scanner;
public class MyClass9 {
    public static int countSpace(String str){
        int spaceCount =  0;
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) == ' '){
                spaceCount++;
            }
        }
        if (spaceCount >= 3) return spaceCount;
        else return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(countSpace(str));

        sc.close();
    }
}
/*PS F:\TCS_Xplore_Java_Training> javac .\PYQS\MyClass9.java
 
*/