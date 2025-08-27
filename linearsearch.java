public class linearsearch {
public static int linear(int numbers[],int key){
for(int i = 0;i<numbers.length;i++){
    if(numbers[i] == key){ 
        return i;
    }
}
return -1;
}


    public static void main(String args[]){
        int key = 3;
        int numbers[] = {1,6,45,7,3,4,66,77};
        int index = linear(numbers,key);
        if(index == -1){
            System.out.print("index not found");
        }
        else{
            System.out.print("index :" + index);
        }
    }
    
}
