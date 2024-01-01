package com.company;

import java.util.List;

public class SearchTree implements NodeList{
    private ListItem root=null;

    public SearchTree(ListItem root){
        this.root=root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root==null){
            this.root=newItem;
            return true;
        }
        //otherise start comparing fro the head of the tree
        ListItem currentItem=this.root;
        while(currentItem!=null){
            int comparison=(currentItem.compareTo(newItem));
            if(comparison<0){
                //new Item is greater than cuurrent root
                if(currentItem.next()!=null){
                    currentItem=currentItem.next();
                }else{
                    currentItem.setNext(newItem);
                    return true;
                }
            }else if(comparison>0){
                if(currentItem.previous()!=null){
                    currentItem=currentItem.previous();
                }else{
                    currentItem.setPrevious(newItem);
                    return true;
                }
            }else{
                System.out.println("Item "+newItem.getValue()+" already present");
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
        if(item==null){
            System.out.println("Invalid Item to delete");
            return false;
        }
        ListItem currentItem=this.root;
        ListItem parentItem=currentItem;

        while(currentItem!=null){
            int comparison=(currentItem.compareTo(item));
            if(comparison<0){
                parentItem=currentItem;
                currentItem=currentItem.next();
            }else if(comparison>0){
                parentItem=currentItem;
                currentItem=currentItem.previous();
            }else{
                //we've found the parent
                if(performRemoval(currentItem,parentItem)){
                    System.out.println(" Successful");
                    return true;
                }

            }
        }
        System.out.println("\nItem "+item.getValue()+" Not present in the Tree");
        return false;
    }

    private boolean performRemoval(ListItem deleteNode,ListItem parentNode){
        //remove the item from the tree..
        if(deleteNode.next()==null){
            //no right tree, so make parent point to left tree (which may be null)
            if(parentNode.next()==deleteNode){
                //item is the right child of its parent
                parentNode.setNext(deleteNode.previous());
            }else if(parentNode.previous()==deleteNode){
                //item is the left child of its parent
                parentNode.setPrevious(deleteNode.previous());
            }else{
                this.root=deleteNode.previous();
            }
        }
        else if(deleteNode.previous()==null){
            if(parentNode.next()==deleteNode){
                //item is right child of its parent
                parentNode.setNext(deleteNode.next());
            }else if(parentNode.previous()==deleteNode){
                //item is left child of its parent
                parentNode.setPrevious(deleteNode.next());
            }else{
                this.root=deleteNode.next();
            }
        }else{
           //neither left nor right child are null
            //from the right sub-tree find the smallest element
            //or from the left sub-tree find the largest element

            ListItem current=deleteNode.next();
            ListItem leftMostParent=deleteNode;

            while(current.previous()!=null){
                leftMostParent=current;
                current=current.previous();
            }

            deleteNode.setValue(current.getValue());

            if(leftMostParent==deleteNode){
                //there was no leftmost node .so current points to the smallest
                //node (the one that must now be deleted).
                deleteNode.setNext(current.next());
            }else{
                leftMostParent.setPrevious(current.next());
            }
        }
        return true;
    }

    @Override
    public void traverse(ListItem root) {
        if(root!=null){
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
