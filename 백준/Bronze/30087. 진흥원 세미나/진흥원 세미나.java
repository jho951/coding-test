import java.util.*;
public class Main{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 0; i< N; i++){
			String str = sc.next();
			switch(str){
				case "Algorithm":
					System.out.println(204);
					break;
				case "Network":
					System.out.println(303);
					break;
				case "CyberSecurity":
					System.out.println("B101");
					break;					
				case "Startup":
					System.out.println(501);
					break;
				case "DataAnalysis":
					System.out.println(207);
					break;
				case "ArtificialIntelligence":
					System.out.println(302);
					break;
				case "TestStrategy":
					System.out.println(105);
					break;
				}
		}	
	}
}