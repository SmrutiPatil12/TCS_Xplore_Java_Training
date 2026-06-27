package InstitutionProblem;

import java.util.Scanner;
public class Solution {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Institution arr[] = new Institution[4];
        
        for(int i = 0 ; i < 4 ; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new Institution(a, b, c, d, e);
        }

        String location = sc.nextLine();
        String name = sc.nextLine();

        int res1 = findNUmClearanceByLoc(arr, location);
        if(res1 > 0){
            System.out.println(res1);
        }else{
            System.out.println("There are no cleared students in this particular location");
        }

        Institution res2 = updateInstitutionGrade(arr, name);
        if(res2 == null){
            System.out.println("No institute is available with the specified name");
        }else{
            System.out.println(res2.getName() + "::" + res2.getGrade());
        }
        sc.close();
    }

    public static int findNUmClearanceByLoc(Institution [] arr, String location){
        int sum = 0;
        for(int i = 0 ; i < 4 ; i++){
            if(arr[i].getLocation().equals(location)){
                sum = sum + arr[i].getnoOfStudentsCleared();
            }
        }
        return sum;
    }

    public static Institution updateInstitutionGrade(Institution[] arr, String name){
        for(int i = 0 ; i < 4 ; i++){
            if(arr[i].getName().equals(name)){
                int rating = (arr[i].getnoOfStudentsCleared() * 100) / arr[i].getnoOfStudentsPlaced();
                if(rating >= 80){
                    arr[i].setGrade("A"); 
                }else{
                    arr[i].setGrade("B");
                }
                return arr[i];
            }
        }  
        return null;  
    }
}

class Institution{
    int id; 
    String name;
    int noOfStudentsPlaced;
    int noOfStudentsCleared;
    String location;
    String grade;

    Institution(int id, String name, int noOfStudentsPlaced, int noOfStudentsCleared, String location){
        this.id = id;
        this.name = name;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.location = location;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getnoOfStudentsCleared(){
        return noOfStudentsCleared;
    }

    public int getnoOfStudentsPlaced(){
        return noOfStudentsPlaced;
    }

    public String getLocation(){
        return location;
    }

    public String getGrade(){
        return grade;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setnoOfStudentsCleared(int noOfStudentsCleared){
        this.noOfStudentsCleared = noOfStudentsCleared;
    }

    public void setnoOfStudentsPlaced(int noOfStudentsPlaced){
        this.noOfStudentsPlaced = noOfStudentsPlaced;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }

}
