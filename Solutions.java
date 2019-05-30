import java.util.*;
public class Solutions {
	//Alejo
	public int jumpingFrog(int r, int l, int y)  {
		Scanner scanner = new Scanner(System.in);
		int numjumps = scanner.nextInt();
		for(int i = 0; i < numjumps; i++) {
	    	    a = scanner.nextInt();
	    	    b = scanner.nextInt();
	    	    c = scanner.nextInt();
	        }
        	if (c%2==0) {
                   return ((a-b)*(c/2));
		} else { 
           	   return ((a-b)*((c-b)/2)+a);
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
	public int getBusRoute (int busRoutes, int time, int mi){
      		Scanner scanner = new Scanner(System.in);
      		busRoutes = scanner.nextInt();
     	 	time = scanner.nextInt();
     		mi = Integer.MAX_VALUE;
      		int result = -1;
      		for (int i = 0; i < n; i++) {
          	    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    if (a < t) {
                    	int x = (time - a + b - 1) / b;
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
    public String ThanosNim (int n, int[] a, int b, int minCount){
       Scanner kbd = new Scanner(System.in);
       n = kbd.nextInt();
       a = new int[n];
       b = 51;
       minCount = 0;
       for (int i = 0; i < n; i++) {
           a[i] = kbd.nextInt();
           b = Math.b(b, a[i]);
       }
       for (int i = 0; i < n; i++) {
           if (a[i] == b) {
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

   public int rollingDice(int num, int goal) {
        Random  = null;
       		 n = s.nextInt();
       			for (int num = 0; i < n; num++) {
            goal = s.nextInt();
        }
        return goal / 2;
    }

//Siababa
public int get (int firstNum, int secondNum){

        secondNum = GetInteger(secondNum);
       
        return ((int)Math.pow(2, Integer.bitCount(secondNum)));
    }

    public int GetInteger(int mysecondNum) {
        int myfirstNum;
        Scanner scan = new Scanner(System.in);
        myfirstNum = scan.nextInt();
        while(myfirstNum-- > 0) {
            mysecondNum = scan.nextInt();
        }
        return mysecondNum;
    }
    
}

//Bernardo
public int getLCM(long myNum, int myAnswer) {
        	Scanner kbd =new Scanner(System.in);
       		myNum = kbd.nextLong();
        	myAnswer = 0;
        	return myMethod(myNum, myAnswer);
	}

    private int myMethod(long myNum, int myAnswer) {
        for(int i=1;i<Math.sqrt(myNum+1);i++){
            if(myNum%i==0){
                myAnswer += 2;
                if(myNum/i==i)
                    myAnswer--;
            }
        }
        return myAnswer;
    }
//Fernandez
 public String getDivisible(int t, int r, int l) {
      		return isDivisible(t, r);
    }

    private String isDivisible(int t, int r) {
        int l;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(;t>0;t-=1) {
            r = sc.nextInt();
            l = sc.nextInt();
        }
        return (r+" "+2*r);
    }
