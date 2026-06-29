package MedicineProblem;

import java.util.Scanner ;
import java.util.Arrays;
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Medicine[] arr = new Medicine[4];

        for(int i = 0 ; i < 4 ; i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Medicine(a,b,c,d);
        }

        String disease = sc.nextLine();

        int []res = getPriceByDisease(arr, disease);
        if(res!= null){
            for(int i = 0; i < res.length ; i++){
                System.out.println(res[i]);
            }
        }else{
            System.out.println("NO medicine found");

        }

        sc.close();
    }
    public static int[] getPriceByDisease(Medicine[] arr, String disease){
        int[] arr2 = new int[0];
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i].getDisease().equalsIgnoreCase(disease)){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i].getPrice();
            }
        }
        if(arr2.length > 0){
            Arrays.sort(arr2);
            return arr2;
        } 
        else return null;
    }
}
class Medicine{
    String medicineName;
    String batch;
    String disease;
    int price;

    Medicine(String medicineName, String batch, String disease, int price){
        this.medicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getMedicineName(){
        return medicineName;
    }

    public String getBatch(){
        return batch;
    }
    public String getDisease(){
        return disease;
    }

    public int getPrice(){
        return price;
    }
}
