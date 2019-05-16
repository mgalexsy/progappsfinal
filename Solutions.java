import java.util.*;
import java.io.*;

public class CompiledCodes{
	
	/**
	* A method called tribonacci
	* @param s initialized as a double array 
	* @param n initialized for the for loop that also contains a conditional statement
	* @return tribArray returns the result of the for loop
	*/

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
	
	/**
	* A method called duplicateCount
	* @param text initialized as a string that takes a String of lowercase and splits them
	* @return countDupes returns the size 
	*/

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
  
  /**
	* A method called getXO
	* @param str a variable for the String class which used in a loop to determine the length and type of letter
	* @return x returns x if equal to o
	*/

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

	/**
	* A method called findUniq
	* @param arr declared as an array to test each node in the array to find the unique number
	* @return arr returns the output
	*/

  public static double findUniq(double arr[]) {
    for(int i = 0; i < arr.length; i++){
      double firstNum = arr[i];
      double secondNum = arr[i+1];
      double thirdNum = arr[i+2];

      //test if secondNum is the unique number
      if(firstNum != secondNum && firstNum == thirdNum){
        arr[0] = secondNum;
        break;
      //test if thirdNum is the unique number
      }else if(firstNum == secondNum && firstNum != thirdNum){
        arr[0] = thirdNum;
        break;
      //test if firstNum is the unique number
      }else if(firstNum != secondNum && firstNum != thirdNum && secondNum == thirdNum){
        arr[0] = firstNum;
        break;
      }
    }
      return arr[0];
  }

	/**
	* A method called TripleDouble
	* @param num1 converts the long data type into a string
	* @param num2 converts the long data type into a string
	* @return 0 is what the method returns
	*/

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
  
  /**
	* A method called checkSecond
	* @param num2 long is converted to a String 
	* @param target A String that is used here for comparing strings 
	* @return true returns true or
	* @return false returns false
	*/
  
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
  
  /**
	* A method called summation
	* @param n serves as the variable in the for loop to how many times it will iterate
	* @return total returns the total count
	*/

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

	/**
	* A method called betweenExtremes
	* @param numbers instantiated as an array for the variables max and min
	* @return result returns the result of max - min
	*/

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

<<<<<<< .mine
public class Dice Rolling {
	int n = s.nextInt();
	for (int i = 0; i < n; i++) {
	int goal = s.nextInt();
	
	System.out.println(goal / 2);
	}
||||||| .r13
=======
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
>>>>>>> .r15
}
<<<<<<< .mine


public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n-- > 0) {
            int a = scan.nextInt();
            System.out.println((int)Math.pow(2, Integer.bitCount(a)));
        }
    }

||||||| .r13
=======
<<<<<<< .mine

}
||||||| .r13
=======

public class 1089L {
    public  static  void  main(String[]args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n =sc.nextInt();
        int k = sc.nextInt();
        int[]p = new int[n];
        int []job = new int[k+1];
        for (int i =0;i<n;i++){
            p[i]= sc.nextInt();
        }
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for (int i=0;i<n;i++){
            int b = sc.nextInt();
            if (job[p[i]]==0)job[p[i]]=b;
            else{
                if (job[p[i]]<b){
                    pq.add(job[p[i]]);
                    job[p[i]]=b;
                }
                else pq.add(b);
            }
        }
        int x =0;
        for (int i=1;i<k+1;i++){
            if (job[i]==0)x++;
        }
        long sum=0;
        while (x-->0){
            sum+=pq.poll();
        }
        pw.println(sum);
        pw.flush();
    }
    static class Scanner
    {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

        public String next() throws IOException
        {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {return Integer.parseInt(next());}

        public long nextLong() throws IOException {return Long.parseLong(next());}

        public String nextLine() throws IOException {return br.readLine();}

        public double nextDouble() throws IOException
        {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if(x.charAt(0) == '-')
            {
                neg = true;
                start++;
            }
            for(int i = start; i < x.length(); i++)
                if(x.charAt(i) == '.')
                {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                }
                else
                {
                    sb.append(x.charAt(i));
                    if(dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg?-1:1);
        }

        public boolean ready() throws IOException {return br.ready();}


    }
}



}


 import java.util.Scanner;

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
>>>>>>> .r15
>>>>>>> .r16
