package BinarySearch;


// leetCode 941. Valid Mountain Array
//Mountain array with Strictly Increasing and Strictly Decresing
public class ValidMountainArray {
    public static void main(String[] args) {

        int[]array1={1,2,3,4,5,4,3,2,1};
        System.out.println(isMountainArray(array1));

        int[]array2={1,2};
        System.out.println(isMountainArray(array2));

        int []array3={2,3,4,5,5,4,3};
        System.out.println(isMountainArray(array2));

    }

    static boolean isMountainArray(int[]array){

        int index=0;
        int end=array.length-1;

        if (array.length<3){
        return false;
        }

       while (index<end){
           if (array[index]<array[index+1]){
               index++;
           }else {
               break;
           }
       }

       if (index==0 || index==end){
           return false;
       }

      while (index<end){
          if (array[index]>array[index+1]) {
              index++;
          }else {
              break;
          }
      }

      return (index==end);
    }

}
