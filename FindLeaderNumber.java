
//A number called a Leader number when all the number present at the right side are smaller than the number.

public class FindLeaderNumber {
    public static void main(String[] args) {

        int []numbers={23,10,5,40,3,25};

       int maxRight=numbers.length-1;

        for (int i = 0; i <numbers.length ; i++) {

            if (numbers[i]>maxRight){
                maxRight=numbers[i];
            }
        }

        System.out.println(maxRight);
    }
}
