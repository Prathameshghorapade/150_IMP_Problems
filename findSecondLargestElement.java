public class findSecondLargestElement {

    public static void main(String[] args) {

        int numbers[] = {1, 5, 3, 2, 6, 7, 8, 20,34};

        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for (int num:numbers){

            if (num>largest){
                secondLargest=largest;
                largest=num;
            }

            if (num<largest && num>secondLargest){
                secondLargest=num;
            }

        }

        System.out.println("largest :"+largest);
        System.out.println("secondLargest :"+secondLargest);
    }
}

