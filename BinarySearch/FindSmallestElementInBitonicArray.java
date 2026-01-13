package BinarySearch;

public class FindSmallestElementInBitonicArray {
    public static void main(String[] args) {

        int []array={3,4,5,4,3,2};
        System.out.println(findMin(array));
    }

    static int findMin(int array[]){
        int lastElement=array.length-1;
        int firstElement=0;
        int ans=-1;

        if (array[firstElement]<array[lastElement]){
            ans=array[firstElement];
            return ans;
        }else {
            return array[lastElement];
        }
    }

}
