public class butterfly {
    public static void butterflyPattern(int row){

        //1st half
        for(int i=1;i<=row;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //spaces 2*(n-i)
            for(int j=1;j<=2*(row-i);j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for(int i=row;i>=1;i--){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //spaces 2*(n-i)
            for(int j=1;j<=2*(row-i);j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();          
        }

    }
    public static void main(String[] args) {
        butterflyPattern(4);
    }
}
