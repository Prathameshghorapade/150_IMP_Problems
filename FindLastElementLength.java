public class FindLastElementLength {

    public static void main(String[] args) {

        String str="   Hello   java ";

        char input[]=str.toCharArray();

        int count=0;
        for (int i=str.length()-1;i>=0;i--){
            if (input[i] != ' '){
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
