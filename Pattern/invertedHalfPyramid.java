import java.util.*;
public class invertedHalfPyramid {

    public static void inverted_Halfpyramid_Number(int row){
        for(int i=1;i<=row;i++){

            //num
            int count =1;
            for(int j=1;j<=row-i+1;j++){
                System.out.print(count);
                count++;
            }
            count=1;

            //spaces

            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_Halfpyramid_Number(5);
    }
}
