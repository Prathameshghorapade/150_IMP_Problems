
//A number called a Leader number when all the number present at the right side are smaller than the number.

public class FindLeaderNumber {
    public static void main(String[] args) {

        int []numbers={23,10,5,9,3};

        int length=numbers.length; //5

        int maxRight=numbers[length-1]; //2

        System.out.println(maxRight);

        for (int index=length-2;index>=0;index--){
            if (numbers[index]>maxRight){
                maxRight=numbers[index];

                System.out.println(maxRight);
            }

        }







    }
}
