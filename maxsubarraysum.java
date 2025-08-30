import java.util.*;
public class maxsubarraysum{
    public static void maxsubarray(int numbers[]){
        int maxsum = Integer.MIN_VALUE;
        int currentsum = 0;
        for(int i =0;i<numbers.length;i++){
            for(int j = i;j<numbers.length;j++){
                currentsum =0;
                for(int k = i;k<=j;k++){
                    currentsum += numbers[k];
                    
                    }
                    System.out.println(currentsum);
                    if(maxsum<currentsum){
                        maxsum = currentsum;
                
                }
            }
        }
                System.out.print("maximumsum" + maxsum);

    }
    public static void main(String args[]){
        int numbers[] = {2,3,4,5,6,8};
        maxsubarray(numbers);
    }
}
