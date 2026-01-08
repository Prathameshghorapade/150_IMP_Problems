package LinearSearch;

public class FindSmallestEle {
    public static void main(String[] args) {

        int[]array={1,2,4,59,0};

        findMinimum(array);

    }

    public static void findMinimum(int array[]){
        int min=array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Minimum Element is :"+min);
    }


}
