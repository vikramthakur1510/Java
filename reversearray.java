public class reversearray {
    public static void reverse(int numbers[]){
        int start =0;
        int last = numbers.length-1;
         
        while(start<last){
           
            int temp = numbers[last];
            numbers[start] = numbers[last];
             numbers[start] = temp;
             start++;
             last--;
        }
    }
    public static void main(String args[]){
        int numbers[] ={2,3,4,5,6,78,8};
        reverse(numbers);
        for(int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }

    }
    
}
