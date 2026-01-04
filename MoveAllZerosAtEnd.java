import java.util.Arrays;

public class MoveAllZerosAtEnd {

    public static void main(String[] args) {

        int [] numbers={1,0,2,0,3,0,4};

        int putNonZeros=0;

        for (int i = 0; i <=numbers.length-1 ; i++) {

            if (numbers[i]!=0){
                int tempt=numbers[putNonZeros];
                numbers[putNonZeros]=numbers[i];
                numbers[i]=tempt;
                putNonZeros++;
            }

        }

        for (int num:numbers){
            System.out.println(num);
        }

    }
}
