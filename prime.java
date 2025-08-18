import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prime = 1;
        for(int i =2 ; i < n/2; i++){
            if ((n%i) == 0){
                prime = 0;
            }
    
        }
        if(prime == 1){
            System.out.print("prime");
        }
        else{
            System.out.print("not prime");
        }
    }
}
