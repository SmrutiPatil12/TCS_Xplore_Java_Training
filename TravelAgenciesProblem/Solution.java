package TravelAgenciesProblem;

import java.util.Scanner;

public class Solution {

    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr){
        int max = arr[0].getPrice();
        for(int i =0; i< arr.length; i++){
            if(max < arr[i].getPrice()){
                max = arr[i].getPrice();
            }
        }
        if(max < 0){
            return 0;
        }else{
            return max;
        }
    }

    public static TravelAgencies agencyDetailsforGivenIdAndType(TravelAgencies[] arr, int regno, String packageType){
        for(int i = 0; i<arr.length; i++){
            if(arr[i].flightFacility == true){
                if(regno == arr[i].regno && packageType.equals(arr[i].packageType)){
                    return arr[i];
                }
            }
        }
        return null;
    };
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        TravelAgencies[] arr= new TravelAgencies[4];
        for(int i = 0; i<4; i++){
            int regno = sc.nextInt(); sc.nextLine();
            String agencyName = sc.nextLine();
            String packageType = sc.nextLine();
            int price = sc.nextInt(); sc.nextLine();
            boolean flightFacility = sc.nextBoolean();

            arr[i] = new TravelAgencies(regno, agencyName, packageType, price, flightFacility);
            
        }
        int regno = sc.nextInt(); sc.nextLine();
        String packageType = sc.nextLine();
        int max = findAgencyWithHighestPackagePrice(arr);
        System.out.println(max);

        // Agency name and price 
        TravelAgencies res = agencyDetailsforGivenIdAndType(arr,regno,packageType);
        System.out.println(res.getAgencyName()+ ":"+ res.getPrice());
        sc.close();
    }
}

class TravelAgencies{
    int regno;
    String agencyName;
    String packageType;
    int price;
    boolean flightFacility;

    public TravelAgencies(int regno, String agencyName, String packageType, int price, boolean flightFacility){
        this.regno = regno;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }
    public int getregno(){
        return regno;
    }

    public String getAgencyName(){
        return agencyName;
    }

    public String getPackageType(){
        return packageType;
    }

    public int getPrice(){
        return price;
    }

    public boolean getFlightFacility(){
        return flightFacility;
    }
}
