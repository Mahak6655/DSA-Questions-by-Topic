import java.util.*;
public class invertedAndRotatedHalfPatten{

    public static void inverted_rotated_Halfpattern(int row){
        for(int i=1;i<=row;i++){
            
            //spaces
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_rotated_Halfpattern(5);
    }
}