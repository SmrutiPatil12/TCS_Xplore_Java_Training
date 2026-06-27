package PYQs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyClass2 {

    public static int findPlayerWithLowestRuns( Player[] players, String playerType){
        int leastRuns = Integer.MAX_VALUE;

        for(Player p : players){
            if(p.getPlayerType().equalsIgnoreCase(playerType)){
                if(p.getRuns() < leastRuns){
                    leastRuns = p.getRuns();
                }
            }
        }
        return leastRuns == Integer.MAX_VALUE ? 0 : leastRuns;
    }

    public static List<Player> findPlayerByMatchType(Player [] players, String matchType){
        List<Player> playerList = new ArrayList<>();
        for(Player p : players){
            if(p.getMatchType().equalsIgnoreCase(matchType)){
                playerList.add(p);
            }
        }

        if(playerList.isEmpty()){
            return null;
        }
        playerList.sort((p1, p2) -> Integer.compare(p2.getRuns(), p1.getRuns()));
        return playerList;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Player [] players = new Player[4];
        for(int i = 0; i<players.length; i++){
            System.out.println("Enter Player " + (i+1) + " Details : ");
            System.out.print("Enter Player Id : ");
            int pid = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Player Name : ");
            String pname = sc.nextLine();
            System.out.print("Enter Player Runs : ");
            int runs = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Player Type : ");
            String playerType = sc.nextLine();
            System.out.print("Enter Match Type : ");
            String matchType = sc.nextLine();

            players[i] = new Player(pid, pname, runs, playerType, matchType);
        }

        System.out.print("Enter Player Type to find lowest runs : ");
        String playerType = sc.nextLine();
        String matchType = sc.nextLine();

        int lowestRuns = findPlayerWithLowestRuns(players, playerType);
        if(lowestRuns == 0){
            System.out.println("No Player Found with Player Type : " + playerType);
        } else {
            System.out.println("Lowest Runs for Player Type " + playerType + " is : "
    + lowestRuns);
        }

        System.out.print("Enter Match Type to find players : ");
        matchType = sc.nextLine();
        List<Player> playerList = findPlayerByMatchType(players, matchType);
        if(playerList == null){
            System.out.println("No Player Found with Match Type : " + matchType);
        } else {
            System.out.println("Players with Match Type " + matchType + " are : ");
            for(Player p : playerList){
                System.out.println("Player Id : " + p.getPid());
                System.out.println("Player Name : " + p.getPname());
                System.out.println("Player Runs : " + p.getRuns());
                System.out.println("Player Type : " + p.getPlayerType());
                System.out.println("Match Type : " + p.getMatchType());
                System.out.println();
            }
        }
        sc.close();
    }
}

class Player{
    private int pid;
    private String pname;
    private int runs;
    private String playerType;
    private String matchType;

    public Player(){

    }

    public Player(int pid, String pname, int runs, String playerType, String matchType){
        this.pid = pid;
        this.pname = pname;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    public int getPid(){
        return pid;
    }

    public void setPid(int pid){
        this.pid = pid;
    }

    public String getPname(){
        return pname;
    }

    public void setPname(String pname){
        this.pname = pname;
    }

    public int getRuns(){
        return runs;
    }

    public void setRuns(int runs){
        this.runs = runs;
    }

    public String getPlayerType(){
        return playerType;
    }

    public void setPlayerType(String playerType){
        this.playerType = playerType;
    }

    public String getMatchType(){
        return matchType;
    }

    public void setMatchType(String matchType){
        this.matchType = matchType;
    }
}
