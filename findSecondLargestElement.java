public class findSecondLargestElement {

    public static void main(String[] args) {

        int numbers[] = {1, 5, 3, 2, 6, 7, 8, 20,34};

        int largestNumber=Integer.MIN_VALUE;

        int secondLargest=Integer.MIN_VALUE;

        for (int number:numbers){

            if (number>largestNumber){

                secondLargest=largestNumber;
                largestNumber=number;
            }else if (number<largestNumber && number>secondLargest){
                secondLargest=number;
            }
        }

        System.out.println("Largest Element :"+largestNumber);
        System.out.println("Second Largest Element :"+secondLargest);



    }
}

