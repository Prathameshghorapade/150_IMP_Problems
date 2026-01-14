package LinearSearch;

public class FindMultipleTargetElements {
    public static void main(String[] args) {

        int [] array={1,2,4,2,4,5,2};
        findMultiple(array,2);
    }


    static void findMultiple(int[]array,int target){

        int ans[]=new int[array.length];

        int counter=0;

        for (int i = 0; i <array.length ; i++) {

            if (array[i]==target){
                ans[counter]=i;
                counter++;
            }
        }

        if (counter==0){
            System.out.println("Element Not Found");
        }

        for (int i = 0; i <counter ; i++) {
            System.out.println("Element found at Indexes :"+ans[i]);
        }

    }
}
