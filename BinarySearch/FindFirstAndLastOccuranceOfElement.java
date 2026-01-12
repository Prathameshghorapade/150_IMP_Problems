package BinarySearch;

public class FindFirstAndLastOccuranceOfElement {

    public static void main(String[] args) {

        int []array={1,2,3,4,5,6,6,6,7,8,9};

        binarySearch(array,6,true);
        binarySearch(array,6,false);

    }

    public static void binarySearch(int[]array,int target,boolean wantFirstOccurance){

        int start=0;
        int end=array.length-1;
        int ans=-1;
        while (start<=end){

            int mid=start+(end-start)/2;

            if (array[mid]==target){
                ans=mid;

                if (wantFirstOccurance){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            } else if (array[mid]<target) {
                start=mid+1;
            }else {
                end=mid-1;
            }

        }

        if (ans==-1){
            System.out.println("Element Not Found");
        }else {
            System.out.println("Target Element "+target+" found At Index "+ans);
        }



    }



}
