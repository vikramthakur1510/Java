public class faccc {
    public static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            
              fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
       int n = 2;
     int factorial = factorial(n);
     System.out.print("factorial = " + factorial );
    }

}
