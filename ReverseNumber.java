public class ReverseNumber {
    public static void main(String[] args) {

        int number=123;

        int resvserNumber=0;

        int lastDigit;

        while (number!=0){

            lastDigit=number%10;

            resvserNumber=resvserNumber*10+lastDigit;

            number=number/10;
        }

        System.out.println(resvserNumber);
    }
}
