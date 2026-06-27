package PhoneProblem;

import java.util.Scanner;
public class Solution{
    public static void main (String[] args){
        Phone [] arr = new Phone[4];
        Scanner sc = new Scanner(System.in);

        for(int i= 0; i< arr.length; i++){
            int phoneId = sc.nextInt(); sc.nextLine();
            String os = sc.nextLine();
            String brand = sc.nextLine();
            int price = sc.nextInt(); sc.nextLine();

            arr[i] = new Phone(phoneId, os, brand, price);
        }

        String brand = sc.nextLine();
        String os = sc.nextLine();

        int sum =  findPriceForGivenBrand(arr, brand);
        if(sum > 0){
            System.out.println(sum);
        }else{
            System.out.println("The given brand is not available.");
        }

        Phone res2 = getPhoneIdBasedOnOs(arr,os);
        if(res2== null){
            System.out.println("No phones are available with specified os and price range.");
        }
        else{
            System.out.println(res2.getPhoneId());
        }
        sc.close();
    }

    public static int findPriceForGivenBrand(Phone[] arr,String brand){
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].getBrand().equals(brand)){
                sum += arr[i].getPrice();
            }
        }
        if (sum>0) return sum;
        else return 0;
    }
    public static Phone getPhoneIdBasedOnOs(Phone[] arr,String os){
        Phone temp = null;
        for(int i = 0; i< arr.length; i++){
            if(arr[i].getOs().equals(os) && arr[i].getPrice()>= 50000){
                return arr[i];
            }
        }
        return temp;
    }
}

class Phone{
    int phoneId;
    String os;
    String brand;
    int price;

    Phone(int phoneId, String os, String brand, int price){
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    public int getPhoneId(){
        return phoneId;
    }

    public String getBrand(){
        return brand;
    }

    public String getOs(){
        return os;
    }

    public int getPrice(){
        return price;
    }
}