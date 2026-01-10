public class MissingElementInArray {

    public static void main(String[] args) {

        int [] numbers={1,2,3,4,6};

       int originallSize=numbers.length+1;

       int originalSum=(originallSize*(originallSize+1))/2;

       int sum=0;

        for (int i = 0; i <=numbers.length-1 ; i++) {

            sum=sum+numbers[i];

        }

        int missingNumber=originalSum-sum;

        System.out.println(missingNumber);

    }
}


