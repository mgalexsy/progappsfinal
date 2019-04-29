import java.util.*;

public class 1077A {
	public static void main(String[] args) {
		Scanner scanny = new Scanner(System.in);
		int x = scanny.nextInt();
		for(int i = 0; i < x; i++) {
			long r = scanny.nextInt();
			long l = scanny.nextInt();
			long y = scanny.nextInt();
			if(y%2==0) System.out.println((r-l)*(y/2));
			else System.out.println((r-l)*((y-1)/2)+r);
		}
	}
}