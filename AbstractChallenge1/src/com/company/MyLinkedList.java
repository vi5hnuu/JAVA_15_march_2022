package com.company;

import java.util.List;

public class MyLinkedList implements NodeList{
    private ListItem root=null;

    public MyLinkedList(){
        this.root=null;
    }
    public MyLinkedList(ListItem root){
        this.root=root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
       if(this.root==null){
           this.root=item;
            return true;
       }
       ListItem currentItem=this.root;
       while(currentItem!=null){
           int comparison=(currentItem.compareTo(item));
           if(comparison<0){
               if(currentItem.next()!=null){
                   currentItem=currentItem.next();
               }else{
                   currentItem.setNext(item);
                   item.setPrevious(currentItem);
               return true;
               }
           }else if(comparison>0){
               if(currentItem.previous()!=null){
                   currentItem.previous().setNext(item);
                   item.setPrevious(currentItem.previous());
                   item.setNext(currentItem);
                   currentItem.setPrevious(item);
               }else{
                   //the node with a prev is root
                   item.setNext(this.root);
                   this.root.setPrevious(item);
                   this.root=item;
               }
               return true;
           }else{
               //equal
               System.out.println(item.getValue()+" is already present");
               return false;
           }
       }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item!=null){
            System.out.print("Deleting item "+item.getValue());
        }
        ListItem currentItem=this.root;
        while(currentItem!=null){
            int comparison=currentItem.compareTo(item);
            if(comparison==0){
                //item to delete
                if(currentItem==this.root){
                    this.root=currentItem.next();
                }else{
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next()!=null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                System.out.println(" Successful");
                return true;
            }else if(comparison<0){
                currentItem=currentItem.next();
            }else{
                //we left the item behind
                System.out.println(" UnSuccessful");
                return false;
            }
        }
        System.out.println("Item Not Found");
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        System.out.println("==================Start===============");
        if(root==null) {
            System.out.println("List is empty");
        }
            while(root!=null){
            System.out.println(root.getValue());
            root=root.next();
        }
        System.out.println("===================End================");

    }
}
