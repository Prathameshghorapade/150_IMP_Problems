public class MissingElementInArray2 {
    public static void main(String[] args) {

        int []numbers={1,2,3,4,6};

      int missingNumber=0;

        for (int i = 0; i <numbers.length ; i++) {
            missingNumber=missingNumber^numbers[i];
        }

        for (int i = 1; i <=6 ; i++) {

            missingNumber=missingNumber^i;

        }

        System.out.println(missingNumber);


    }
}