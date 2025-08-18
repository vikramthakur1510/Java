import java.util.*;
public class cost {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
int pencil = sc.nextInt();
int pen = sc.nextInt();
int eraser = sc.nextInt();
int total = pencil + pen + eraser;
System.out.println(total);
float  newtotal = 0.18f * total;
System.out.println(newtotal);
}    
}
