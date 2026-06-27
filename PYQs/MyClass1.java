// Find the average of numbers between lower and upper limit from given array of numbers.
// Example :
// Input : 1 2 3 4 5
// Lower limit : 2
// Upper limit : 6
// Output : 4
package PYQs;

import java.util.Scanner;
public class MyClass1 {

    public static int getAverage(int n, int[] arr, int lower, int upper){
        long sum = 0;
        int count = 0;

        for(int a : arr){
            if(a>lower && a<upper){
                sum += a;
                count++;
            }
        }

        double avg = (double)sum/count;
        return (int)avg;
    }
    public static void main(String [] args){
         Scanner sc = new Scanner(System.in);

         int n = 5;
         int [] arr = new int[n];

         System.out.println("Enter " + n + " numbers : ");
         for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
         }

         System.out.println("Enter lower and upper limit : ");

         int lower = sc.nextInt();
         int upper = sc.nextInt();

         System.out.println("Average of numbers between " + lower + " and " + upper + " is : ");
         System.out.println(getAverage(n, arr, lower, upper));
         sc.close();
    }
}
/*
PS F:\TCS_Xplore_Java_Training> javac .\PYQs\MyClass1.java
PS F:\TCS_Xplore_Java_Training> java PYQs.MyClass1        
Enter 5 numbers : 
1
2
3
4
5
Enter lower and upper limit : 
2
6
Average of numbers between 2 and 6 is : 
4 */