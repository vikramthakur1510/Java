public class binarysearch {
    public static int search(int number[],int key){
        int start = 0;
        int end = number.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(number[mid] == key){
                return mid;
            }
            if(number[mid] > key){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
                }
        
        return -1;
            }
    public static void main(String args[]){
        int number[] = {1,2,4,6,7,8,9};
        int key = 9;
        System.out.print("index :" + search(number,key));
    }
    
}
