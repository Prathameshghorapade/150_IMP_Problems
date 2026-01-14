package LinearSearch;

public class findFirstAndLastOccurance {
    public static void main(String[] args) {

        int []array={1,2,3,2,5,6,7,2};
        findelemnt(array,2,true);

        findelemnt(array,2,false);


    }

   static void findelemnt(int[]arry,int target,boolean isLastOccurance){

        int ans=0;
       for (int i = 0; i <arry.length ; i++) {
           if (arry[i]==target){
               ans=i;

               if (isLastOccurance==false){
                   break;
               }
           }
       }

       if (isLastOccurance){
           System.out.println("Last Occurance of Element "+target+" Index is " + ans);
       }else {
           System.out.println("First Occurance of Element "+target+" Index is " + ans);

       }


   }




}
