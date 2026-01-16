public class findSecondLargestElement {

    public static void main(String[] args) {

        int numbers[] = {1, 5, 3, 2, 6, 7, 8, 20,34};

      int largestElement=Integer.MIN_VALUE;
      int secondLargestElement=Integer.MIN_VALUE;


      for (int number:numbers){

          if (number>largestElement){

              secondLargestElement=largestElement;
              largestElement=number;
          }

          if (number<largestElement && number>secondLargestElement){

              secondLargestElement=number;
          }
      }

        System.out.println("Largest Element :"+largestElement);
        System.out.println("Second Largest Element :"+secondLargestElement);



    }
}

