import java.util.*;
public class reverse {
public static void main(String args[]){

int rev = 0;
int n = 10934;
while(n>0){
int lastdigit = n%10;
rev = rev*10 + lastdigit;
n = n/10;
} System.out.print (rev);
}
}