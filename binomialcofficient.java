public class binomialcofficient {
    public static int factorial(int n){
        int f =1;
        for(int i=1;i<=n;i++){
            f = f*i;
        }
        return f ;
    }
    public static int bincoeff(int n,int r){
      int factn = factorial(n);
       int  factr = factorial(r);
        int factnmr = factorial(n-r);
int bincoff = factn/(factr*factnmr);
return bincoff;
    }
    public static void main(String args[]){
        System.out.print(bincoeff(5,4));
    }
}
