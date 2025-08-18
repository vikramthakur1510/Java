import java.util.*;
public class functions {
    public static int calculatesum(int x,int y){//formal parameter
        int sum = x + y;
 return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = calculatesum(a,b);//argument or actual parameter 
    System.out.print("sum = " + sum);
    }
    
}
