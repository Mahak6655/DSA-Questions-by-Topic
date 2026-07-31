import java.util.*;

public class floydsTri {

    public static void floyds_triangle(int row){
        int count =1;
        for(int i=1;i<=row;i++){

            for(int j=1;j<=i;j++){

                System.out.print(count+" ");
                count++;
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyds_triangle(5);
    }
}
