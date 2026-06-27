package InventoryProblem;
import java.util.Arrays;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Inventory[] arr = new Inventory[4];
        for(int i = 0 ; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            int b = sc.nextInt(); sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Inventory(a, b, c, d);
        }
        int limit = sc.nextInt();

        Inventory[] arr2 = replinish(arr, limit);
        for(int i = 0 ; i < arr2.length; i++){
            if(arr2[i].getThreshold() > 75){
                System.out.println(arr2[i].getId() + " Critical filling");
            } else if(arr2[i].getId()>= 50 && arr2[i].getId()<=75){
                System.out.println(arr2[i].getThreshold() + "Moderate Filling");
            } else {
                System.out.println(arr2[i].getId()+ "Non critical filling");
            }
        }

        sc.close();
    }
    public static Inventory[] replinish(Inventory[] arr, int limit){
        Inventory[] arr2 = new Inventory[0];
        for(int i = 0 ; i < 4 ; i++){
            if(arr[i].getThreshold() <= limit){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
        }
        return arr2;
    }
}
class Inventory{
    int inventoryId ;
    int maximumQuantity ;
    int currentQuantity ;
    int threshold ;

    Inventory(int inventoryId, int maximumQuantity, int currentQuantity, int threshold){
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }

    public int getId(){
        return inventoryId;
    }

    public int getmaximumQuantity(){
        return maximumQuantity;
    }

    public int getcurrentQuantity(){
        return currentQuantity;
    }

    public int getThreshold(){
        return threshold;
    }
}