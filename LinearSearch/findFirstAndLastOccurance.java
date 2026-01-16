package LinearSearch;

public class findFirstAndLastOccurance {
    public static void main(String[] args) {

        int []array={1,2,3,2,5,6,7,2};
        findelemnt(array,2,true);

        findelemnt(array,2,false);


    }

 public static void findelemnt(int array[],int target,boolean isLastOccurance){

        int ans=0;
     for (int i = 0; i <array.length ; i++) {

         if (array[i]==target){

             ans=i;

             if (!isLastOccurance){
                 break;
             }
         }

     }


     if (isLastOccurance){
         System.out.println("Element "+target+" Last Occurance is :"+ans);
     }else {
         System.out.println("Element "+target+" FirstOccurance Occurance is :"+ans);
     }
 }



}
