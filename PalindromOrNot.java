public class PalindromOrNot {
    public static void main(String[] args) {

        String str="madam";

        int start=0;

        int end=str.length()-1;

        boolean isPalindrome=true;

        for (int i = 0; i <str.length() ; i++) {

            if (str.charAt(start) != str.charAt(end)){
                isPalindrome=false;
            }

            start++;
            end--;
        }

        System.out.println(isPalindrome);

    }
}
