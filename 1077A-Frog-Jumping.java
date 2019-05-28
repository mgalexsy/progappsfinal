public int jumpingFrog(int r, int l, int y)  {
		Scanner scanny = new Scanner(System.in);
		int x = scanny.nextInt();
		for(int i = 0; i < x; i++) {
		   r = scanny.nextInt();
			l = scanny.nextInt();
			y = scanny.nextInt();
		}
      if(y%2==0) {
         return ((r-l)*(y/2));
	   } else { 
         return ((r-l)*((y-1)/2)+r);
      }

	}
