package com.example._static;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList_C {
    private final Map<String,StockItem_C> list;
    public StockList_C(){
        this.list=new LinkedHashMap<>();
    }
    public int addStock(StockItem_C item){
        if(item!=null){
            //check if we already have quantity of tis item
            StockItem_C inStock=list.getOrDefault(item.getName(),item);
            //if there are already stock of this item,adjust the quantity
            if(inStock!=item){
                //already in stock list
                inStock.adjustStock(item.availableQuantity());
                return inStock.availableQuantity();
            }
            else{
                list.put(item.getName(),item);
                return item.availableQuantity();
            }
        }
        return 0;
    }

    public int sellStock(String item,int quantity){
        StockItem_C inStock=list.get(item);
        if(inStock!=null && quantity>0)
            return inStock.finaliseStock(quantity);
        return 0;
        //        StockItem_C inStock=list.getOrDefault(item,null);
//        if(inStock!=null && quantity>0 && (inStock.availableQuantity()>=quantity)){
//            inStock.adjustStock(-quantity);
//            return quantity;
//        }
//        if(inStock!=null && inStock.availableQuantity()<=0)
//            System.out.println(inStock.getName()+ " Out of stock");
//        return 0;
    }
    public int reserveStock(String item,int quantity){
        StockItem_C inStock=list.get(item);
        if(inStock!=null && quantity>=0){
            return inStock.reserveStock(quantity);
        }
        return 0;
    }
    public int unReserveStock(String item,int quantity){
        StockItem_C inStock=list.get(item);
        if(inStock!=null && quantity>=0){
            return inStock.unReserveStock(quantity);
        }
        return 0;
    }
    public StockItem_C get(String key){
        return list.get(key);
    }

    public Map<String,Double> priceList(){
        Map<String,Double> prices=new LinkedHashMap<>();
        for(Map.Entry<String,StockItem_C> item:list.entrySet())
            prices.put(item.getKey(),item.getValue().getPrice());
        return Collections.unmodifiableMap(prices);
    }
    public Map<String,StockItem_C> items(){
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
        for(Map.Entry<String,StockItem_C> item:list.entrySet()){
           StockItem_C StockItem_C=item.getValue();
           double itemValue=StockItem_C.getPrice()*StockItem_C.availableQuantity();
           s=s+StockItem_C+" there are "+StockItem_C.availableQuantity()+" in stock";
           s=s+" value of items "+String.format("%.2f",itemValue)+" \n";
           totalCost+=itemValue;
       }
       return s+"\nTotal Stock value "+String.format("%.2f",totalCost);
    }
}
