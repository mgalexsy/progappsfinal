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