package MovieProblem;
import java.util.Arrays;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Movie arr[] = new Movie[4];
        for(int i = 0 ; i < 4 ; i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Movie(a, b, c, d);
        }
        String genere = sc.nextLine();
        // call the method here

        String[] res =  getMovieByGenre(arr, genere);
        for(int i =0; i< res.length; i++){
            System.out.println(res[i]);
        }
        sc.close();
    }
    public static String[] getMovieByGenre(Movie[] arr, String genere){
        String[] arr2 = new String[4];
        for(int i = 0 ; i < 4 ; i++){
            if(arr[i].getGenere().equals(genere)){
                if(arr[i].getBudget()> 80000000){
                    arr2 = Arrays.copyOf(arr2,arr2.length + 1);
                    arr2[arr2.length - 1] = "High Budget Movie";
                }else{
                    arr2 = Arrays.copyOf(arr2,arr2.length + 1);
                    arr2[arr2.length - 1] = "Low budget value";
                }
            }
        }
        return arr2;
    }
}
class Movie{
    String movieName;
    String company;
    String genere;
    int budget;

    Movie(String movieName, String company, String genere, int budget){
        this.movieName = movieName;
        this.budget= budget;
        this.company = company;
        this.genere = genere;
    }

    public String getMovieName(){
        return movieName;
    }

    public String getCompany(){
        return company;
    }

    public String getGenere(){
        return genere;
    }

    public int getBudget(){
        return budget;
    }
}
