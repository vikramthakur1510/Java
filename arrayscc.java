import java.util.*;
public class arrayscc { 
    public static void main(String args[]){

        int marks[] = new int[50];
    Scanner sc =new Scanner(System.in);
    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();
    System.out.println("physics = " +  marks[0]);
    System.out.println("chemistry = " +  marks[1]);
    System.out.println("math  = " +  marks[2]);

    int percentage = (marks[0] + marks[1] +marks[2])/3;
    System.out.print("pecentages : " + percentage + "%");
    System.out.print("length of array" +marks.length);
}
}