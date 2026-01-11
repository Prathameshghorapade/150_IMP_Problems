public class ReverseOnlyVowels {

    public static void main(String[] args) {

        String str="hello";

        char[]strArray=str.toCharArray();

        String vowels="aeiouAEIOU";

        int start=0;
        int end=strArray.length-1;

        while (start<end){

            if (vowels.indexOf(strArray[start]) ==-1){
                start++;
            }else if (vowels.indexOf(strArray[end])==-1){
                end--;
            }else {

                char temp=strArray[end];
                strArray[end]=strArray[start];
                strArray[start]=temp;

                start++;
                end--;

            }

        }


        System.out.println(strArray);
    }
}


