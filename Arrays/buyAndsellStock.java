import java.util.*;
public class buyAndsellStock {

    public static int buyAndSellStocks(int stocks[]){
        int bp = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for(int i=0;i<stocks.length;i++){
            if(bp < stocks[i]){
                int profit = stocks[i] - bp;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                bp = stocks[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int stocks[] = {7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(stocks));
    }
}
