public class producct {
    public static int multiply(int a,int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        int a = 876;
        int b = 6;
        int prod = multiply(a,b);
        System.out.print("product = " + prod);
    }
}