package com.example._static;

import java.util.*;

public class StockList {
    private final Map<String,StockItem> list;
    public StockList(){
        this.list=new LinkedHashMap<>();
    }
    public int addStock(StockItem item){
        if(item!=null){
            //check if we already have quantity of tis item
            StockItem inStock=list.getOrDefault(item.getName(),item);
            //if there are already stock of this item,adjust the quantity
            if(inStock!=item){
                //already in stock list
                inStock.adjustStock(item.QuantityInStock());
                return inStock.QuantityInStock();
            }
            else{
                list.put(item.getName(),item);
                return item.QuantityInStock();
            }
        }
        return 0;
    }

    public int sellStock(String item,int quantity){
        StockItem inStock=list.getOrDefault(item,null);
        if(inStock!=null && quantity>0 && (inStock.QuantityInStock()>=quantity)){
            inStock.adjustStock(-quantity);
            return quantity;
        }
        if(inStock!=null && inStock.QuantityInStock()<=0)
            System.out.println(inStock.getName()+ " Out of stock");
        return 0;
    }

    public StockItem get(String key){
        return list.get(key);
    }

    public Map<String,Double> priceList(){
        Map<String,Double> prices=new LinkedHashMap<>();
        for(Map.Entry<String,StockItem> item:list.entrySet())
            prices.put(item.getKey(),item.getValue().getPrice());
        return Collections.unmodifiableMap(prices);
    }
    public Map<String,StockItem> items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString(){
       String s="\nStock List\n";
       double totalCost=0.0;
       //Map(Interface) has Entry interface and concreate class implemented Map(interface)
//        An interface, i.e., declared within another interface or class,
//        is known as a nested interface. The nested interfaces are used
//        to group related interfaces so that they can be easy to maintain. The nested interface must be referred to by the outer interface or class. It can't be accessed directly.
        for(Map.Entry<String,StockItem> item:list.entrySet()){
           StockItem stockItem=item.getValue();
           double itemValue=stockItem.getPrice()*stockItem.QuantityInStock();
           s=s+stockItem+" there are "+stockItem.QuantityInStock()+" in stock";
           s=s+" value of items "+String.format("%.2f",itemValue)+" \n";
           totalCost+=itemValue;
       }
       return s+"\nTotal Stock value "+String.format("%.2f",totalCost);
    }
}
