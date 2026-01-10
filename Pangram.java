public class Pangram {
    public static void main(String[] args) {

        String str="abcdefghijklmnopqrstuvwxyz";

        str=str.toLowerCase();

        System.out.println(isPangram(str));

    }

   static boolean isPangram(String input){

        input=input.toLowerCase();

        if (input.length()<26){
            return false;
        }

       for (int i = 'a'; i <='z' ; i++) {
           if (input.indexOf(i)<0){
               return false;
           }
       }
       return  true;
   }


}
