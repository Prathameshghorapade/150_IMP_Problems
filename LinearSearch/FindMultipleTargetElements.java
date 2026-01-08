package LinearSearch;

public class FindMultipleTargetElements {
    public static void main(String[] args) {

        int [] array={1,2,4,2,4,5,2};
        findMultiple(array,2);
    }

    public static void findMultiple(int array[],int taget){

        int ans[]=new int[array.length];
        int counter=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]==taget){
                ans[counter]=i;
                counter++;
            }
        }
        if (counter==0){
            System.out.println("Elemet is Not Found At Any Index");
        }

        for (int i = 0; i <counter ; i++) {
            System.out.println("Element found at these Indexses:"+ans[i]);
        }

    }
}
