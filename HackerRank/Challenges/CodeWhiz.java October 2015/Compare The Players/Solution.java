import java.io.*;
import java.util.*;

// Solution stars here(Checker Class)
class Checker
{
    Comparator<Player> desc=new Comparator<Player>() {
        @Override
        public int compare(Player a, Player b) {
            if(a.score==b.score)
            {
                if(a.name.compareTo(b.name)>0)
                    return -1;
                if(a.name.compareTo(b.name)<0)
                    return 1;
                return 0;
            }       
            if(a.score>b.score)
                return -1;
            if(a.score<b.score)
                return 1;
            return 0;
        }
    };
}// ends.

class Player
{
	String name;
	int score;
}

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
	  int N=Integer.parseInt(br.readLine().trim());
	  String s;
	  StringTokenizer st;
	  Player Player[]=new Player[N];
	  Checker check=new Checker();
	  for(int i=0;i<N;i++)
	  {
		  s=br.readLine().trim();
		  st=new StringTokenizer(s);
		  Player[i]=new Player();
		  Player[i].name=st.nextToken();
		  Player[i].score=Integer.parseInt(st.nextToken());
	  }
	  Arrays.sort(Player,check.desc);
	  for(int i=0;i<Player.length;i++)
	  {
			System.out.printf("%s %s\n",Player[i].name,Player[i].score);
	  }		
    }
}