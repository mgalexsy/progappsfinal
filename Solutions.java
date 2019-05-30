import java.util.*;
public class Solutions {
	//Alejo
	public int jumpingFrog(int r, int l, int y)  {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for(int i = 0; i < number; i++) {
	    	    r = scanner.nextInt();
	    	    l = scanner.nextInt();
	    	    y = scanner.nextInt();
	        }
        	if (y%2==0) {
                   return ((r-l)*(y/2));
		} else { 
           	   return ((r-l)*((y-1)/2)+r);
                }

          }

	//Siababa
    	public int get (int firstNum, int secondNum){
        	Scanner scan = new Scanner(System.in);
        	firstNum = scan.nextInt();
        	while(firstNum-- > 0) {
             	     secondNum = scan.nextInt();
        	}
        	return ((int)Math.pow(2, Integer.bitCount(secondNum)));
    }
	
  	//Fernandez
	public String getDivisible(int t, int r, int l) {
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(;t>0;t-=1) {
		   r = sc.nextInt();
		   l = sc.nextInt();
		}
      		return (r+" "+2*r);
	}

//Bernardo
	public int getLCM(long firstNum, int answer) {
        	Scanner cin =new Scanner(System.in);
       		firstNum = cin.nextLong();
        	answer = 0;
       		for(int i=1;i<Math.sqrt(firstNum+1);i++){
       	  	   if(firstNum%i==0){
          	      answer += 2;
          	   if(firstNum/i==i) 
          	      answer--;
	           }
                }   
        	return answer;
	}
//Soriano
	public int getServalAndBus (int n, int t, int mi){
      		Scanner scanner = new Scanner(System.in);
      		n = scanner.nextInt();
     	 	t = scanner.nextInt();
     		mi = Integer.MAX_VALUE;
      		int result = -1;
      		for (int i = 0; i < n; i++) {
          	    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    if (a < t) {
                    	int x = (t - a + b - 1) / b;
                    	a = a + x * b;
                    }
          	    if (a < mi) {
                   	mi = a;
                   	result = i + 1;
                    }
      		}
      		return result;
      }

	   //Cayadi
    public String ThanosNim (int n, int[] a, int min, int minCount){
       Scanner kbd = new Scanner(System.in);
       n = kbd.nextInt();
       a = new int[n];
       min = 51;
       minCount = 0;
       for (int i = 0; i < n; i++) {
           a[i] = kbd.nextInt();
           min = Math.min(min, a[i]);
       }
       for (int i = 0; i < n; i++) {
           if (a[i] == min) {
               minCount++;
           }
       }
       if (minCount <= n / 2) {
           return "Alice";
       } else {
           return "bob";
       }

  }
}
	
	//Fider

   public int rollingDice(int n, int goal) {
        Random s = null;
        n = s.nextInt();
        for (int i = 0; i < n; i++) {
            goal = s.nextInt();
        }
        return goal / 2;
    }
