import java.util.*;
import java.io.*;

public class CompiledCodes{
  public static double[] tribonacci(double[] s, int n) {
	      double[] tribArray = new double[n];
	        for(int i = 0; i<tribArray.length;i++) {
	            if (i < 3) {
	                tribArray[i]=s[i];
	            } else {
	                tribArray[i]=tribArray[i-3]+tribArray[i-2]+tribArray[i-1];
	            }
	        }
	        return  tribArray;
	}
	

  public static int duplicateCount(String text) {
        String[] allLowerCase = text.toLowerCase().split("");
        Map<String, Integer> countDupes = new HashMap<String, Integer>();

        for(String s: allLowerCase){
            Integer frequency = countDupes.get(s);
            countDupes.put(s,(frequency==null) ? 1 : frequency + 1);
        }
        Integer i =1;
        countDupes.values().removeAll(Collections.singleton(i));

        return countDupes.size();

  }
  
  public static boolean getXO (String str) {
    int x = 0;
    int o = 0;
    for (int i = 0; i < str.length(); i++){
      char c = str.charAt(i);
      if (c == 'x' || c == 'X') {
        x++;
      }else if (c == 'o' || c =='O') {
        o++;
      }
    }
      return x == o;
  }

  public static double findUniq(double arr[]) {
    for(int i = 0; i < arr.length; i++){
      double firstNum = arr[i];
      double secondNum = arr[i+1];
      double thirdNum = arr[i+2];
      if(firstNum != secondNum && firstNum == thirdNum){
        arr[0] = secondNum;
        break;  
      }else if(firstNum == secondNum && firstNum != thirdNum){
        arr[0] = thirdNum;
        break;  
      }else if(firstNum != secondNum && firstNum != thirdNum && secondNum == thirdNum){
        arr[0] = firstNum;
        break;
      }
    }
      return arr[0];
  }

  public static int TripleDouble(long num1, long num2){
        String number1 = Long.toString(num1);
        String number2 = Long.toString(num2);
        int count = 0;
        for(int i = 0; i < number1.length();i++){
            if((number1.length() - i) < 3){
                return 0;
              }
              if(number1.substring(i,i+1).equals(number1.substring(i+1,i+2)) && number1.substring(i,i+1).equals(number1.substring(i+2, i+3))){
                if(checkSecond(num2,number1.substring(i,i+1))){
                    return 1;
                  }
                }
              }
              return  0;
  }
  
  
  public static boolean checkSecond(long num2,String target){
      String num = Long.toString(num2);
      int count = 0;
      for(int i = 0; i < num.length(); i++){
          if(num.substring(i,i+1).equals(target)){
              count++;
          }
      }if(count >= 2){
          return true;
      }else{
          return false;
      }
  }
  
  public static int summation(int n) {
    int total = 1;
    for (int count = 2; count <= n; count ++) {
      if(count > 1){
        total = total + count;
      } else if (count < 1) {
        total = total * count;
      } else if (count > 1) {
        total = total - count;
      } else if (count >= 2) {
        total = total / count;
      }
    }
      return total;
  }
	
  public static int betweenExtremes(int[] numbers){
    int result = 0;
    int max = numbers[0];
    int min = numbers[0];
    for (int count = 0; count < numbers.length; count++){
         if(max < numbers[count]){
            max = numbers[count];
        }else {
         if(min > numbers[count]){
            min = numbers[count];
          }
        }
      }
    result = max - min;
    return result;
  }
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t,r,l;
		t = sc.nextInt();
		for(;t>0;t-=1) {
			r = sc.nextInt();
			l = sc.nextInt();
			System.out.println(r+" "+2*r);
		}
		sc.close();
	}


  public static int servalAndBus (int n, int t, int mi){
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



public int rollingDice(int n, int goal) {
        Random s = null;
        n = s.nextInt();
        for (int i = 0; i < n; i++) {
            goal = s.nextInt();
        }
        return goal / 2;
    }


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

	/**
	* A method called SuperHeroBattle
	* @param healthStat is the health of the monster and the number of heroes, attacks are the damage dealt by the heroes in a 1 hero per minute to attack
	* @return result shows the number of minutes for the monster's health to be 0 or -1 when the heroes can not defeat the monster
	*/
	public static int enterGame(String healthStat, String attacks) {
	   int[] LifePoint = breakUp(HealthStat);
	   int[] DMG = breakUp(attacks);
	   int tot = summing(DMG);
	   if(tot<0){
	      return timeConut(LifePoint, DMG);
	   }
	   else
	      return -1;
	}
	public static int[] breakUp(String hold) {
	   String[] temp = hold.split(" ");
	   int[] number = new int[temp.length];
		for(int j=0; j<temp.length; j++) {
			number[j] = Integer.parseInt(temp[j]);
		}
		return number;
	}
	public static int summing(int[] tm) {
	   int Total = 0;
	   for(int g = 0; g<tm.length; g++) {
	      Total += tm[g];
	   }
	   return Total;
	}
	public static int timeConut(int[] stat, int[] hits) {
		int Hp = stat[0];
		int minutes = 0;
		while(Hp>0) {
		   for(int k = 0; k<stat[1]; k++) {
		      Hp += hits[k];
		      minutes++;
		      if(Hp<0){
		         break;
		      }
		   }
		}
		return minutes;
	}



public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n-- > 0) {
            int a = scan.nextInt();
            System.out.println((int)Math.pow(2, Integer.bitCount(a)));
        }
    }

}

public class 1068B-LCM {
	public static void main (String args[])
	{
		Scanner cin =new Scanner(System.in);
		long b = cin.nextLong();
		int ans = 0;
		
		for(int i=1;i<Math.sqrt(b+1);i++)
			if(b%i==0)
			{
				ans += 2;
				if(b/i==i) 
					ans--;
			}

		System.out.println(ans);
		cin.close();
	}
}

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
	
	
