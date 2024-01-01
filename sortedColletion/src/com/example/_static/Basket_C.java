package com.example._static;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket_C {
    private final String name;
    private final Map<StockItem_C,Integer> list;

    public Basket_C(String name){
        this.name=name;
        this.list=new TreeMap<>();
    }

    public int addToBasket(StockItem_C item,int quantity){
        if((item!=null) && (quantity>0)){
            int inBasket=list.getOrDefault(item,0);
            list.put(item,inBasket+quantity);
            return inBasket;
        }
        return 0;
    }

    public int removeFromBasket(StockItem_C item,int quantity){
        if(item!=null && quantity>0){
            //check if we already have item in basket
            int inBasket=list.getOrDefault(item,0);
            int newQuantity=inBasket-quantity;
            if(newQuantity>0){
                list.put(item,newQuantity);
                return quantity;
            }else if(newQuantity==0){
                list.remove(item);
                return quantity;
            }
        }
        return 0;
    }
    public void cleanBasket(){
        this.list.clear();
    }
    public Map<StockItem_C,Integer> items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString(){
        String s="\nShopping basket "+name+" contains "+(list.size()==1 ? "1 item ":list.size()+" items")+"\n";
        double totalCost=0.0;
        for(Map.Entry<StockItem_C,Integer> item:list.entrySet()){
            s=s+item.getKey()+", "+item.getValue()+" purchased\n";
            totalCost+=item.getKey().getPrice()*item.getValue();
        }
        return s+" Total Cost "+totalCost;
    }
}
