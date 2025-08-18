public class primee{
public static boolean isprime(int n){
    boolean isprime = true;
    for(int i = 2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            isprime = false;
        }
    } 
    return isprime;
}
public static void printprime(int n){
    for(int i=2;i<=n;i++){
        if(isprime(i)){
            System.out.print(i + " ");
        }
        
    }
    System.out.println();
}
public static void main(String args[]){
    printprime(500);
}
}


