public class arraysc {
    public static void update(int marks[]){
        for(int i = 0 ; i < marks.length;i++){  
marks[i] = marks[i] + 1;

        }
                }
                            public static void main(String args[]){
        int marks[] = {97,96,78};
        update(marks);
        for(int i =0;i<marks.length;i++){ 
            System.out.print(marks[i]+" ");
        }

}}
