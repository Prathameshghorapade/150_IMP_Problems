public class MoveAllZerosAtStart {


    public static void main(String[] args) {

        int[] numbers = {1, 0, 2, 0, 3, 0, 4, 0};

        int putAllNonZeros=numbers.length-1;

        for (int i = numbers.length-1; i >=0 ; i--) {

            if (numbers[i]!=0){
                int temp=numbers[putAllNonZeros];
                numbers[putAllNonZeros]=numbers[i];
                numbers[i]=temp;
                putAllNonZeros--;
            }
        }

        for(int i:numbers){
            System.out.println(i);
        }

    }
}
