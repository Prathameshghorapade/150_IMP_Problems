import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {


        int number =5;

      int result=1;

        for (int i = 1; i <=number ; i++) {
            result=result*i;
        }

        System.out.println(result);


        // if the number is bigger use BIGINTEGER

//        int number=21;
//
//        BigInteger result=BigInteger.ONE;
//
//        for (int i = 1; i <=number; i++) {
//
//            result=result.multiply(BigInteger.valueOf(i));
//        }
//
//        System.out.println(result);
//
//
  }
}
