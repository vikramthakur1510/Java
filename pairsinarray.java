public class pairsinarray {
    public static void printpairs(int numbers[]){
        int tp =0;
        for(int  i= 0;i<numbers.length;i++){
            for(int j =i+1 ;j<numbers.length;j++){
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")" );
                tp++;
            }
        System.out.println();
        }
        System.out.print("total pairs : " + tp);
    }
    public static void main(String args[]){
        int numbers[] = {2,3,4,45,67,89,45,349,54,6,788,9,9,789,9,9,5,6,7,8};
printpairs(numbers);
    }
    
}
