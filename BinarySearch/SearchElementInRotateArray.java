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

        while (start<=end) {

            int mid = start + (end - start) / 2;

            if (array[mid] == target) {
                return mid;
            }


            //left hand Sorted
            if (array[start] <= array[mid]) {

                if (target >= array[start] && target < array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {

                if (target <= array[end] && target > array[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return ans;


    }


}
