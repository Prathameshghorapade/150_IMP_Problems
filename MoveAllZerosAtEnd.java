import java.util.Arrays;

public class MoveAllZerosAtEnd {

    public static void main(String[] args) {

        int[] numbers = {1, 0, 2, 0, 3, 0, 4};

        int putAllNonZeros=0;

        for (int i = 0; i <numbers.length ; i++) {

            if (numbers[i] !=0){

                int temp=numbers[putAllNonZeros];
                numbers[putAllNonZeros]=numbers[i];
                numbers[i]=temp;
                putAllNonZeros++;
            }
        }

      for (int i:numbers){
          System.out.println(i);
      }



    }
}
