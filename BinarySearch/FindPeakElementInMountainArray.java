package BinarySearch;

public class FindPeakElementInMountainArray {
    public static void main(String[] args) {

        int[]array={1,2,3,4,5,4,3,2,1};

        System.out.println(findPeak(array));

    }

    static int findPeak(int[]array){

    int start=0;
    int end=array.length-1;

    while (start<end){
        int mid=start+(end-start)/2;
        if (array[mid]<array[mid+1]){
            start=mid+1;
        }else {
            end=mid;
        }
    }
    return array[start];

    }
}
