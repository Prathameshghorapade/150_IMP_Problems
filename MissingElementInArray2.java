public class MissingElementInArray2 {
    public static void main(String[] args) {

        int number[]={1,2,3,4,6};

        int missingNumber=0;

        for (int i = 0; i <number.length ; i++) {
            missingNumber=missingNumber^number[i];
        }

        for (int i = 1; i <=6 ; i++) {
            missingNumber=missingNumber^i;
        }

        System.out.println("Missing Number :"+missingNumber);



    }
}