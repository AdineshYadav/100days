public class FiboDp {
    public static void main(String[] args) {
        System.out.println(fibRecursion(7));
        int n = 50;
        System.out.println(fibTopDown(n,new int[n+1])); // we will be passing the storage array of n+1 size as we want to include every single index
    }

    //simple recursive approach
    public static  int fibRecursion(int n){
        if(n == 1 || n == 0){
            return n;
        }

        int fib1 = fibRecursion(n-1);
        int fib2 = fibRecursion(n-2);
        int fib = fib1 + fib2;
        return fib;
    }

    // Top down dynamic programming approach
    public static  int fibTopDown(int n , int[] strg){
        if(n == 1 || n == 0){
            return n;
        }

        if(strg[n] != 0){
            return strg[n];
        }

        int fib1 = fibTopDown(n-1 , strg);
        int fib2 = fibTopDown(n-2 , strg);
        int fib = fib1 + fib2;
        strg[n] = fib;
        return fib;
    }

    //Bottom up dynamic programming approach
    public static int fibBottomUp(int n){
        int[] strg = new int[n+1];

        strg[0] = 0;
        strg[1] = 1;

        for(int i = 2 ; i <= n ; i++){
            strg[i] = strg[i-1] + strg[i-2];
        }

        return strg[n];
    }

    //Bottom up space efficient approach because we are using the array of size 2 only
    public static int fbBottomSpace(int n){

        int[] strg = new int[2];
        strg[0] = 0 ;
        strg[1] = 1 ;
        for(int slide = 1 ; slide <= n-1 ; slide++){
            int sum = strg[0]+strg[1];
            strg[0] = strg[1];
            strg[1] = sum;
        }

        return strg[1];
    }
}
