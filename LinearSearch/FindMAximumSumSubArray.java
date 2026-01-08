package LinearSearch;

public class FindMAximumSumSubArray {
    public static void main(String[] args) {

        int [][]array={
                {1,2,3,4,5},
                {6,7,8,9,1},
                {2,20,10,3,4}
        };

        findMax(array);

    }

    public static void findMax(int array [][]){

        int max=Integer.MIN_VALUE;

        int index=0;

        for (int i = 0; i <array.length ; i++) {
            int sum=0;

            for (int j = 0; j <array[i].length ; j++) {

                sum = sum + array[i][j];
            }

                if (sum>max){
                    max=sum;
                    index=i;
                }


        }
        System.out.println("MAximum Sum of Array is :"+max +" for index :"+index);



    }
}
