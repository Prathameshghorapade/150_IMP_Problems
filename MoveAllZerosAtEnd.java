import java.util.Arrays;

public class MoveAllZerosAtEnd {

    public static void main(String[] args) {

        int arry[] = {2, 0, 4, 5, 0, 3, 0, 6};

        int putNonZeros=0;

        for (int i = 0; i <arry.length ; i++) {

            if (arry[i]!=0){

                int temp=arry[putNonZeros];

                arry[putNonZeros]=arry[i];

                arry[i]=temp;

                putNonZeros++;

            }


        }

        for (int num :arry){
            System.out.println(num);
        }

    }
}
