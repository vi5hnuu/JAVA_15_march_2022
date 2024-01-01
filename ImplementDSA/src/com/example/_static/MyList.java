package com.example._static;

import java.util.Collection;

public interface MyList<E> extends Collection<E> {
    public void add(int index, E e);

    public E get(int index);

    public int indexOf(Object e);

    public int lastIndexOf(E e);

    public E remove(int index);

    public E set(int index, E e);

    @Override
    public default boolean add(E e) {
        add(size(), e);
        return true;
    }

    @Override
    public default boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public default boolean remove(Object e) {
        if (indexOf(e) >= 0) {
            remove(indexOf(e));
            return true;
        } else
            return false;
    }

    @Override
    public default boolean containsAll(Collection<?> c) {
        
            return true;
    }

    @Override
    public default boolean addAll(Collection<? extends E> c){

    }
}