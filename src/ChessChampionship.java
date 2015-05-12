import java.util.ArrayList;
import java.util.List;

public class ChessChampionship {

     public int[] points(String[] games) {
         int[] retval = new int[games.length];
         for(int i =0;i<games.length;i++){retval[i] = 0;}
         for(int i = 0;i<games.length;i++){for(int j = 0;j<games.length;j++){
        	 if(games[i].charAt(j)=='W'){retval[i]+=3;}
        	 if(games[i].charAt(j)=='L'){retval[j]+=3;}
        	 if(games[i].charAt(j)=='D'){retval[i]+=1;retval[j]+=1;}
         }
     }
         return retval;
         
 }
     public static void main(String[] args){
       	ChessChampionship apt = new ChessChampionship();
       	
       	List<String> input = new ArrayList<String>();
       	input.add("-WW");
       	input.add("W-W");
       	input.add("WW-");
       	System.out.println(apt.points(input.toArray(new String[0])));
     }}