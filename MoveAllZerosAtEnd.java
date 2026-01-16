import java.util.Arrays;

public class MoveAllZerosAtEnd {

    public static void main(String[] args) {

       int number[]={0,1,0,2,0,3,4,5};

       int putAllNonZeros=0;

        for (int i = 0; i <number.length ; i++) {

            if (number[i]!=0){

                int temp=number[putAllNonZeros];
                number[putAllNonZeros]=number[i];
                number[i]=temp;
                putAllNonZeros++;

            }

        }
        for (int i = 0; i <number.length ; i++) {
            System.out.println(number[i]);
        }

    }
}
