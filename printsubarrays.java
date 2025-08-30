public class printsubarrays {
    public static void subarrays(int numbers[]){
        int ts =0;
        for(int i = 0;i<numbers.length;i++){
            for (int j =i;j<numbers.length;j++){
                for(int k =i;k<=j;k++){
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
                ts++;
            }

        }
        System.out.print("total subarrays : " + ts);
    }
    public static void main(String args[]){
        int numbers[] = {2,3,4,5,6,78,9,67,56,45,34,42};
        subarrays(numbers);
    }
    
}
