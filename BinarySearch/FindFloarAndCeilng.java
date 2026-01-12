package BinarySearch;

public class FindFloarAndCeilng {
    public static void main(String[] args) {

        int []array={1,2,3,4,5,6,7,9};

        System.out.println("Floar is :"+findFloar(array,8));
        System.out.println("Ceiling is "+findCeiling(array,8));

    }

    static int findFloar(int []array,int target){
        int start=0;
        int end=array.length-1;
        int ans=-1;
        while (start<=end){
            int mid=start+(end-1)/2;

            if (array[mid]==target){
                ans=array[mid];
                break;
            } else if (array[mid]<target) {
                start=mid+1;
                ans=array[mid];
            }else {
                end=mid-1;
            }
        }

        return ans;


    }

    static int findCeiling(int[]array,int target){

        int start=0;
        int end=array.length-1;
        int ans=-1;
        while (start<=end){
            int mid=start+(end-start)/2;

            if (array[mid]==target){
                ans=array[mid];
                break;
            } else if (array[mid]<target) {
                start=mid+1;
            }else {
                end=mid-1;
                ans=array[mid];
            }
        }

        return ans;


    }



}
