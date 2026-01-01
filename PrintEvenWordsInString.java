public class PrintEvenWordsInString {

    public static void main(String[] args) {

        //           2  4    2     7
        String str="My name is Pratham";

        String indiviualWords[]=str.split(" ");

        for (int i = 0; i <indiviualWords.length ; i++) {
            if (indiviualWords[i].length() %2 ==0){
                System.out.println(indiviualWords[i]);
            }
        }
    }
}
