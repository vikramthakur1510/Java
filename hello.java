import java.util.*;
public class hello {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int evensum = 0;
int oddsum = 0;
int choice ;

do{
    System.out.print("enter integer");
int n = sc.nextInt();
if(n%2 == 0){
    evensum += n;
}
else{
    oddsum += n;
}
System.out.println("enter choice");
choice = sc.nextInt();
} while(choice ==  1);
System.out.println("sum of even num : " + evensum);
System.out.println("sum of odd num : " + oddsum);

    }
    
}
