public class findSecondLargestElement {

    public static void main(String[] args) {

        int numbers[] = {1, 5, 3, 2, 6, 7, 8,20};

        int largestElement = Integer.MIN_VALUE;

        int secondLArgest = Integer.MIN_VALUE;


        for (int number : numbers){

            if (number>largestElement){

                secondLArgest=largestElement;
                largestElement=number;
            }
            else if (number>secondLArgest && number!=largestElement){

                secondLArgest=number;
            }
        }

        System.out.println("Largest Ele :"+largestElement);
        System.out.println("Second Largest :"+secondLArgest);



    }
}
