


public class MountainArray {

    public static void main(String[] args) {

        int []array={1,2,1};

        System.out.println(isMountainArray(array));

    }

    public static boolean isMountainArray(int []array){


        int i=0;

        if (array.length<3){
            return  false;
        }

        while ( i+1<array.length &&  array[i]<array[i+1]){
            i++;
        }

        while (i+1<array.length&& array[i]>array[i+1]){
            i++;
        }

        return  array.length-1==i;



    }
}
