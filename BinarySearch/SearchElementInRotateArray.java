package BinarySearch;


// LeetCode 33.  Search in Rotated Sorted Array

public class SearchElementInRotateArray {
    public static void main(String[] args) {

        int[]array={4,5,1,2,3};

        System.out.println("Element Found At Index :"+search(array,2));
    }

    static int search(int[]array,int target){

        int start=0;
        int end=array.length-1;

        int ans=-1;
        int mid=-1;

        while (start<=end){

            mid=start+(end-start)/2;

            if (array[mid]==target){
                return mid;
            }

            //left side sorted
            if (array[start]<=array[mid]){
                //can ele found at left side

                if (target>=array[start] && target<array[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }

            }else {

                //right side is sorted

                if (target<=array[end] && target>array[mid]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }

        }

        return ans;


    }
}
