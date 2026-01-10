
//A number called a Leader number when all the number present at the right side are smaller than the number.

public class FindLeaderNumber {
    public static void main(String[] args) {

        int []numbers={23,10,5,9,3};

        int length=numbers.length;

        int maxRight=numbers[length-1];

        System.out.println(maxRight);

        for (int i = length-2; i >=0 ; i--) {
            if (numbers[i]>maxRight){
                maxRight=numbers[i];
                System.out.println(maxRight);

            }
        }


    }
}
