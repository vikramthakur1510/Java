import java.util.*;
public class prefixarray {
    public static void maxsubarray(int numbers[]){
        int maxsum = Integer.MIN_VALUE;
        int currentsum = 0;
        int prefix[] = new int[numbers.length];
prefix[0] = numbers[0];
        for(int i = 1;i<prefix.length;i++ ){
prefix[i] = prefix[i-1] + numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            for(int j = i;j<numbers.length;j++){
                currentsum = i == 0 ? prefix[j] : prefix[j] - prefix[i- 1];
                    
                    if(maxsum<currentsum){
                        maxsum = currentsum;
                
                }
            }
        }
                System.out.print("maximumsum " + maxsum);

    }
    public static void main(String args[]){
        int numbers[] = {1,-2,6,-1,3};
        maxsubarray(numbers);
    }
    
}
