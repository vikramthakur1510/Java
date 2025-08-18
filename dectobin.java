public class dectobin {
    public static int dectobinary(int n){
    int pow = 0;
    int bin = 0;
    while(n>0){
      int rem = n % 2;
        bin = bin + rem*(int)Math.pow(10,pow);
       n= n/2;
       pow++;
    }
    return bin;
    }
    public static void main(String args[]){
        System.out.print(dectobinary(34));
    }
    }
    

