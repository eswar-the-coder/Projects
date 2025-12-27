package q11487;
import java.util.*;
public class CTJ11487 {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		char p1,p2;
		p1=s.next().charAt(0);
		p2=s.next().charAt(0);
		if(p1=='R' && p2=='P') System.out.println("p2 Wins");
		else if(p1=='P' && p2=='R') System.out.println("p1 Wins");
		else if(p1=='P' && p2=='S') System.out.println("p2 Wins");
		else if(p1=='S' && p2=='P') System.out.println("p1 Wins");
		else if(p1=='S' && p2=='R') System.out.println("p2 Wins");
		else if(p1=='R' && p2=='S') System.out.println("p1 Wins");
		else if(p1==p2) System.out.println("Tie");
		else System.out.println("Invalid Input");
	}
}
