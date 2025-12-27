package q11487;
import java.util.*;
public class CTJ11487 {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		char p1,p2;
		int a=0,b=0;
		for(int i=0;i<3;i++){
			p1=s.next().charAt(0);
		p2=s.next().charAt(0);
		if(p1=='R' && p2=='P') b++;
		else if(p1=='P' && p2=='R') a++;
		else if(p1=='P' && p2=='S') b++;
		else if(p1=='S' && p2=='P') a++;
		else if(p1=='S' && p2=='R') b++;
		else if(p1=='R' && p2=='S') a++;
		else System.out.println("Invalid Input");
		}
		if(a>b) System.out.println("P1");
		if(a<b) System.out.println("P2");
		if(a==b) System.out.println("Tie");
		
	}
}
