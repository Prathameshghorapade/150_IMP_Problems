package LinearSearch;

public class findFirstAndLastOccurance {
    public static void main(String[] args) {

        int []array={1,2,3,2,5,6,7,2};
        findelemnt(array,2,true);

        findelemnt(array,2,false);


    }

    public static void findelemnt(int []array,int target,boolean lastOccurance){

        int ans=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]==target){
                ans=i;
                if (lastOccurance==false){
                    break;
                }
            }
        }
        if (lastOccurance==true){
            System.out.println("Last Occurance Index of target Element is :"+ans);
        }else {
            System.out.println("First Occurance Index of target Element is :"+ans);
        }



    }
}
