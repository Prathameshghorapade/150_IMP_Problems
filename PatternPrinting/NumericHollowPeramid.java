package PatternPrinting;

public class NumericHollowPeramid {

    public static void main(String[] args) {

     int totalNumberOfRows=10;

     for (int row=1;row<=totalNumberOfRows;row++){

         for (int column=1;column<=row;column++){

             if (column==1 || column==row || row==totalNumberOfRows){

                 System.out.print(column);
             }else {
                 System.out.print(" ");
             }
         }

         System.out.println();
     }

    }
}
