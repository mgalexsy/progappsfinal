
//Alejo
public int jumpingFrog(int r, int l, int y)  {
	Scanner scanner = new Scanner(System.in);
	int x = scanner.nextInt();
	for(int i = 0; i < x; i++) {
	    r = scanner.nextInt();
	    l = scanner.nextInt();
	    y = scanner.nextInt();
	}
        if(y%2==0) {
           return ((r-l)*(y/2));
	} else { 
           return ((r-l)*((y-1)/2)+r);
        }

}

//Siababa
public class Solutions{
    public int get (int firstNum, int secondNum){

        Scanner scan = new Scanner(System.in);
        firstNum = scan.nextInt();
        while(firstNum-- > 0) {
             secondNum = scan.nextInt();
        }
        return ((int)Math.pow(2, Integer.bitCount(secondNum)));
    }
