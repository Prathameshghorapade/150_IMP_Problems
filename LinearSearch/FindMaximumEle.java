package LinearSearch;

public class FindMaximumEle {
    public static void main(String[] args) {

        int []array={1,2,3,10,30,20,5,4};
        findMax(array);
    }

    public static void findMax(int []array){
        int max=array[0];
        for (int i = 0; i <array.length ; i++) {
            if (max<array[i]){
                max=array[i];
            }
        }
        System.out.println("Maximum Element is :"+max);
    }
}
