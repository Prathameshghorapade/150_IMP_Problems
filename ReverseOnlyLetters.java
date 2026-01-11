import java.time.temporal.ChronoField;

public class ReverseOnlyLetters {

    public static void main(String[] args) {

        String str = "1abcd2";

       char [] strArray= str.toCharArray();

      int start=0;
      int end=strArray.length-1;

      while (start<end){

          if (Character.isLetter(strArray[start]) && Character.isLetter(strArray[end])){

              char temp=strArray[end];
              strArray[end]=strArray[start];
              strArray[start]=temp;

          }

          start++;
          end--;
      }

        System.out.println(strArray);



    }

}
