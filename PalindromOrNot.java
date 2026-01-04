public class PalindromOrNot {
    public static void main(String[] args) {

        String str="madam";

        int start=0;

        int end=str.length()-1;

        boolean isPalindrome=true;
        for (int i = 0; i <str.length()-1 ; i++) {

            if (str.charAt(start) != str.charAt(end)){
                isPalindrome=false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome){
            System.out.println("String is Palindrome");
        }else System.out.println("Not Palindrome");


    }
}
