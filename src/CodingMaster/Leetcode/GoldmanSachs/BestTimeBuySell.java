package CodingMaster.Leetcode.GoldmanSachs;

import java.util.Scanner;

public class BestTimeBuySell {
    public int maxProfit(int[] prices){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            else if(prices[i]-minPrice > maxProfit){
                maxProfit=prices[i]-minPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of prices:");
        int priceCount=sc.nextInt();
        System.out.println("Enter prices:");
        int [] inputPrices=new int[priceCount];
        for(int i=0;i<inputPrices.length;i++){
            inputPrices[i]=sc.nextInt();
        }
        BestTimeBuySell bestTimeBuySell=new BestTimeBuySell();
        int maximumProfit=bestTimeBuySell.maxProfit(inputPrices);
        System.out.println("Maximum profit is" +maximumProfit);
    }
}
