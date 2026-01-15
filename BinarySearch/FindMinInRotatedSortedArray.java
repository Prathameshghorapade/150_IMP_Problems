package BinarySearch;

// LeetCode 153. Find Minimum in Rotated Sorted Array

public class FindMinInRotatedSortedArray {

    public static void main(String[] args) {

        int[]array={5,6,2,3,4,5};
        System.out.println("Smallest Element is :"+findMIN(array));

    }


    static int findMIN(int[]array){

        int start=0;

        int end=array.length-1;

        int minimumElement=Integer.MAX_VALUE;

        while (start<=end){

            int mid=start+(end-start)/2;

            if (array[start]<=array[mid]){

                minimumElement=Math.min(minimumElement,array[start]);
                start=mid+1;
            }else {

                minimumElement=Math.min(minimumElement,array[mid]);
                end=mid-1;
            }
        }

        return minimumElement;
    }
}
