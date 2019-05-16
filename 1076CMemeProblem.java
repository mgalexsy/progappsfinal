import java.util.Scanner;
public class A { 
	
	public static void main(String[] sachin32) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		while(t-->0) {
			double d = in.nextDouble();
			
			if(d*d-4*d<0) System.out.println("N");
			else {
				double b = (d-Math.sqrt(d*d-4*d))/2;
				double a = d-b;
				System.out.println("Y "+a+" "+b);
			}
			
		}
		
		in.close();
	}
}