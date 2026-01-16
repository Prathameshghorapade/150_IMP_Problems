public class PalindromOrNot {
    public static void main(String[] args) {



        String str="madam";

       char[] strArray=str.toCharArray();

       int start=0;
       int end=strArray.length-1;

       boolean isPalindrome=true;

        for (int i = 0; i < strArray.length ;i++) {

            if (strArray[start] !=strArray[end]){
                isPalindrome=false;
            }

            start++;
            end--;



        }

        System.out.println(isPalindrome);

    }
}
