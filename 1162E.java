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
