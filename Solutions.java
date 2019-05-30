import java.util.*;
public class Solutions {
	//Alejo
  public int jumpingFrog(){
	 Scanner scan = new Scanner(System.in);	
           int firstJump = 0;
           int secondJump = 0;
           int thirdJump =0;
           int x = scan.nextInt();
		
	  
	  for(int i = 0; i < x; i++){
	    	    firstJump = scan.nextInt();
	    	    secondJump = scan.nextInt();
	    	    thirdJump = scan.nextInt();
	  }
           if (thirdJump%2==0) {
                     return ((firstJump-secondJump)*(thirdJump/2));
           } 
	   else { 
           	   return ((firstJump-secondJump)*((thirdJump-secondJump)/2)+firstJump);
           }
   }

  
	
	//Soriano
	public int getBusRoute (){
      		Scanner scanner = new Scanner(System.in);
      		int busRoutes;
                int time;
                int maxInteger;
                int n = 0;
                busRoutes = scanner.nextInt();
     	 	time = scanner.nextInt();
     		maxInteger = Integer.MAX_VALUE;
      		int result;
                 result = -1;
      		for (int i = 0; i < n; i++) {
          	    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                          int t = 0;
                    if (a < t) {
                    	int x = (time - a + b - 1) / b;
                    	a = a + x * b;
                    }
          	    if (maxInteger < a) {
                    } else {
                        maxInteger = a;
                        result = i + 1;
                          }
      		}
      		return result;
      }

	


	
	//Fider

public int rollingDice() {
        Random integer = null;
	int num = 0;
        int goal = 0;
        num = integer.nextInt();
        for (int i = 0; i < num; i++) {
            goal = integer.nextInt();
        }
        return goal / 2;
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

	//Bernardo

   
    public int getLCM() {
                long firstNum;
                int answer;
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

	//Fernandez
	public String getDivisible() {
                int firstNum;
                int secondNum = 0;
                int thirdNum;
		Scanner sc = new Scanner(System.in);
		firstNum = sc.nextInt();
		for(;firstNum>0;firstNum-=1) {
		    secondNum = sc.nextInt();
		    thirdNum = sc.nextInt();
		}
		return (secondNum+" "+2*secondNum);
	}


	//Cayadi
	public int getRemainder (){
        	Scanner sc=new Scanner(System.in);
        	int firstInput=sc.nextInt();
        	int secondInput=sc.nextInt();
        	int thirdInput=sc.nextInt();
        	String oneOrZero =sc.next();
        	int count=0;
        	for(int i=firstInput-secondInput;i<firstInput;i++) {
            		if(i==firstInput-thirdInput-1) {
                		if(oneOrZero.charAt(i)!='1') {
                    			count++;
                		}
            		}
            		else if(oneOrZero.charAt(i)=='1') {
                		count++;
            		}
        	}

        	return count;
    	}

}


