import java.util.*;
public class factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        int i;
if (n == 0){
    System.out.print("1");
}
else{
    for(i=1;i<=n;i++){
        fact = fact*i;
    }
    System.out.print("factorial = " + fact);
}
    }
}
