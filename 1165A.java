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