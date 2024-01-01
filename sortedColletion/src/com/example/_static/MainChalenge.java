package com.example._static;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Map;

public class MainChalenge {
    private static final StockList_C StockList_C=new StockList_C();
    public static void main(String[] args) {
        StockItem_C temp=new StockItem_C("bread",0.86,100);
        StockList_C.addStock(temp);

        temp=new StockItem_C("car",12.50,2);
        StockList_C.addStock(temp);
        temp=new StockItem_C("chair",62.0,7);
        StockList_C.addStock(temp);
        temp=new StockItem_C("cup",0.50,200);
        StockList_C.addStock(temp);
        temp=new StockItem_C("cup",0.45,7);
        StockList_C.addStock(temp);
        temp=new StockItem_C("door",72.95,4);
        StockList_C.addStock(temp);
        temp=new StockItem_C("juice",2.50,36);
        StockList_C.addStock(temp);
        temp=new StockItem_C("phone",96.99,35);
        StockList_C.addStock(temp);
        temp=new StockItem_C("towel",2.40,80);
        StockList_C.addStock(temp);
        temp=new StockItem_C("vase",8.76,40);
        StockList_C.addStock(temp);


        System.out.println(StockList_C);

        for(String s:StockList_C.items().keySet())
            System.out.println(s); //unmodifiableMap preserve order

        Basket_C timsBAsket=new Basket_C("Tim");
        sellItem(timsBAsket,"car",2);
        System.out.println(timsBAsket);
        sellItem(timsBAsket,"car",1);
        System.out.println(timsBAsket);

        sellItem(timsBAsket,"juice",36);
        sellItem(timsBAsket,"juice",1);
        sellItem(timsBAsket,"cup",13);
        sellItem(timsBAsket,"bread",1);

        System.out.println("==============");
        System.out.println(StockList_C);

        Basket_C basket_c=new Basket_C("Customer");
        sellItem(basket_c,"cup",100);
        sellItem(basket_c,"juice",5);
        sellItem(basket_c,"cup",1);
        removeItem(basket_c,"cup",1);
        System.out.println(basket_c);

        removeItem(timsBAsket,"car",1);
        removeItem(timsBAsket,"cup",9);
        removeItem(timsBAsket,"car",1);
        System.out.println("cars removed "+removeItem(timsBAsket,"car",1));
        System.out.println(timsBAsket);

        //remove all items from timsBasket
        removeItem(timsBAsket,"bread",1);
        removeItem(timsBAsket,"cup",3);
        removeItem(timsBAsket,"juice",4);
        removeItem(timsBAsket,"cup",3);
        System.out.println(timsBAsket);

        System.out.println("\nDisplay stock list before and after checkout");
        System.out.println(basket_c);
        System.out.println(StockList_C);
        checkOut(basket_c);
        System.out.println(basket_c);
        System.out.println(StockList_C);

        StockItem_C car=StockList_C.items().get("car");
        if(car!=null){
            car.adjustStock(2000);
        }
        if(car!=null) {
            StockList_C.get("car").adjustStock(-1000);
        }
        System.out.println(StockList_C);

        checkOut(timsBAsket);
        System.out.println(timsBAsket);
    }

    public static int sellItem(Basket_C basket,String item,int quantity){
        //retrieve the item from stock list
        StockItem_C StockItem_C=StockList_C.get(item);
        if(StockItem_C==null) {
            System.out.println("We dont sell " + item);
            return 0;
        }
        if(StockList_C.reserveStock(item,quantity)!=0){

            return basket.addToBasket(StockItem_C,quantity);
        }
        return 0;
    }
    public static int removeItem(Basket_C basket,String item,int quantity){
        //retrieve the item from stock list
        StockItem_C StockItem_C=StockList_C.get(item);
        if(StockItem_C==null) {
            System.out.println("We dont sell " + item);
            return 0;
        }
        if(basket.removeFromBasket(StockItem_C,quantity)==quantity){
            return StockList_C.unReserveStock(item, quantity);
        }
        return 0;
    }
    public static void checkOut(Basket_C basket){
        for(Map.Entry<StockItem_C,Integer> item:basket.items().entrySet()){
            StockList_C.sellStock(item.getKey().getName(),item.getValue());
        }
        basket.cleanBasket();
    }
}
