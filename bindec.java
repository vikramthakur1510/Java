public class bindec { 
    public static void bintodec(int binnum){
        int mynum = binnum;
        int dec = 0;
        int pow = 0;
        int ld;
        while(binnum>0){
            ld = binnum % 10;
            dec = dec + (ld*(int)Math.pow(2,pow));
            pow++;
            binnum = binnum/10;

        }
        System.out.print(mynum + "=" + dec); 
    }
    public static void main(String args[]){
        bintodec(111);
    }
    
}
