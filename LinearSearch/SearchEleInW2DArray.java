package LinearSearch;

public class SearchEleInW2DArray {
    public static void main(String[] args) {

        int array2D[][]={
                {1,3,1,3,4,5},
                {3,4,6,3,5,7},
                {3,4,2,5,7,9}
        };

        findEle(array2D,4,false);

        findEle(array2D,3,true);


    }

    public static void findEle(int array[][],int target,boolean lastOccurance){
        int outerLoop=0;
        int innerLoop=0;

        boolean found=false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if (array[i][j]==target){
                    outerLoop=i;
                    innerLoop=j;
                }
            }
            if (lastOccurance==false){
                found=true;
                break;
            }

            if(found==true){
                break;
            }
        }





        System.out.println(outerLoop+" "+innerLoop);


    }}
