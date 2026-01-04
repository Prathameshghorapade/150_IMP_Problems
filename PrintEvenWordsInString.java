public class PrintEvenWordsInString {

    public static void main(String[] args) {

        //           2  4    2     7
        String str = "My name is Pratham";

       String[] wordsArray =str.split(" ");

        for (int i = 0; i <wordsArray.length-1 ; i++) {

            if (wordsArray[i].length()%2==0){

                System.out.println(wordsArray[i]);
            }
        }


    }
}
