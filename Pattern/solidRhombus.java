public class solidRhombus {

    public static void solidRhombbusPattern(int n){
        for(int i=0;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        solidRhombbusPattern(5);
    }
}
