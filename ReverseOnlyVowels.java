public class ReverseOnlyVowels {

    public static void main(String[] args) {

        String str="hello";

        char[] strArray=str.toCharArray();
        int start=0;
        int end=str.length()-1;

        String vowels="aeiouAEIOU";


        while (start<end){

            if (vowels.indexOf(strArray[start]) == -1){
                start++;
            }else if (vowels.indexOf(strArray[end])== -1){
                end--;
            }else {

                char temp=strArray[end];
                strArray[end]=strArray[start];
                strArray[start]=temp;

                start++;
                end--;



            }

        }

        for(char chracter:strArray){
            System.out.print(chracter);
        }
    }
}


