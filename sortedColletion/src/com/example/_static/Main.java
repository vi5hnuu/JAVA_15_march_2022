package com.example._static;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Map;

public class Main {
private static final StockList stockList=new StockList();
    public static void main(String[] args) {
        StockItem temp=new StockItem("bread",0.86,100);
        stockList.addStock(temp);

        temp=new StockItem("car",12.50,2);
        stockList.addStock(temp);
        temp=new StockItem("chair",62.0,7);
        stockList.addStock(temp);
        temp=new StockItem("cup",0.50,200);
        stockList.addStock(temp);
        temp=new StockItem("cup",0.45,7);
        stockList.addStock(temp);
        temp=new StockItem("door",72.95,4);
        stockList.addStock(temp);
        temp=new StockItem("juice",2.50,36);
        stockList.addStock(temp);
        temp=new StockItem("phone",96.99,35);
        stockList.addStock(temp);
        temp=new StockItem("towel",2.40,80);
        stockList.addStock(temp);
        temp=new StockItem("vase",8.76,40);
        stockList.addStock(temp);


        System.out.println(stockList);

        for(String s:stockList.items().keySet())
            System.out.println(s); //unmodifiableMap preserve order

        Basket timsBAsket=new Basket("Tim");
        sellItem(timsBAsket,"car",2);
        System.out.println(timsBAsket);
        sellItem(timsBAsket,"car",1);
        System.out.println(timsBAsket);
        System.out.println(timsBAsket);

        sellItem(timsBAsket,"juice",36);
        sellItem(timsBAsket,"juice",1);
        sellItem(timsBAsket,"cup",13);
        sellItem(timsBAsket,"bread",1);
        System.out.println(timsBAsket);

        System.out.println("==============");
        System.out.println(stockList);

//        temp=new StockItem("pen",1.12);
//        stockList.items().put(temp.getName(),temp);//unmodifiable map
//        but
        stockList.items().get("car").adjustStock(2000);
        System.out.println(stockList);

        stockList.get("car").adjustStock(-1000);
        System.out.println(stockList);

        for(Map.Entry<String,Double> price:stockList.priceList().entrySet())
            System.out.println(price.getKey()+" cost "+price.getValue());
    }

    public static int sellItem(Basket basket,String item,int quantity){
        //retrieve the item from stock list
        StockItem stockItem=stockList.get(item);
        if(stockItem==null) {
            System.out.println("We dont sell " + item);
            return 0;
        }
        if(stockList.sellStock(item,quantity)!=0){
            basket.addToBasket(stockItem,quantity);
//            System.out.println("hey "+stockItem+" "+quantity);
            return quantity;
        }
        return 0;
    }
}
