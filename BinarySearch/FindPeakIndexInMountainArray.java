package BinarySearch;

//Leetcode 852. Peak Index in a Mountain Array

public class FindPeakIndexInMountainArray {

    public static void main(String[] args) {

        int[]array={1,2,3,4,5,4,3,2,1};

        System.out.println("Peak Element At Index :"+peekIndex(array));

    }


   static int peekIndex(int[]array) {

       int start = 0;
       int end = array.length - 1;

       while (start < end) {

           int mid = start + (end - start) / 2;
           if (array[mid] < array[mid + 1]) {
               start = mid + 1;
           } else {
               end = mid;
           }
       }

       return start;
   }



}
