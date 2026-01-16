package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {

        //Array Should Be Sorted
        int[]array={2,3,10,20,30,40,50};

        searchElement(array,30);
    }



    static void searchElement(int[]array,int target) {

        int start=0;
        int end=array.length-1;

        int ans=-1;

        while (start<=end){

            int mid=start+(end-start)/2;

            if (array[mid] ==target){
                ans=mid;
                break;
            }

            if (array[mid]<target){
                start=mid+1;
            }else {
                end=mid-1;
            }

        }

        if (ans==-1){
            System.out.println("Element Not Found");
        }else {
            System.out.println("Element"+target +" Found At Index :"+ans);
        }
    }

}
