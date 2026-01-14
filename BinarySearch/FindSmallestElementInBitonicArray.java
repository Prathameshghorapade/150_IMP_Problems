package BinarySearch;

public class FindSmallestElementInBitonicArray {
    public static void main(String[] args) {

        int []array={3,4,5,4,3,2};
        System.out.println("Minimum Ele :"+findMin(array));

        System.out.println("MAXIMUM Ele "+findMAx(array));


    }

   static int findMin(int[]array){

        int firstEle=0;
        int lastElement=array.length-1;
        int ans=-1;

        if (array[firstEle]<array[lastElement]){
            ans=firstEle;
            return ans;
        }else {
            return array[lastElement];
        }
   }


   static int findMAx(int[]array){
        int firstEle=0;
        int lastEle=array.length-1;

        int ans=-1;

        if (array[firstEle]>array[lastEle]){
            ans=lastEle;
            return ans;
        }else {
            return array[firstEle];
        }
   }

}
