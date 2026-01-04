import java.util.StringTokenizer;

public class ReplaceVowelsWithX {

    public static void main(String[] args) {

        String str="hello";

        str=str.toLowerCase();

        StringBuilder result=new StringBuilder();

        for (char character:str.toCharArray()){
            if (character =='a' || character=='e' || character=='i' || character=='o' || character=='u'){
                result.append('x');
            }
            else {
                result.append(character);
            }
        }

        System.out.println(result.toString());
    }
}
