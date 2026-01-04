public class FindLastElementLength {

    public static void main(String[] args) {

        String str="   Hello   java ";

        char [] strArray=str.toCharArray();

        int count =0;
        for (int i = strArray.length-1; i >0 ; i--) {

            if (strArray[i] != ' '){
                count=count+1;
            }else {
                if (count>0){
                    System.out.println(count);
                    break;
                }
            }

        }


    }
}
