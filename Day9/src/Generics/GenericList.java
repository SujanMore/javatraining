package Generics;

import java.util.ArrayList;

public class GenericList<T> {

    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){

        list.add(element);
    }

    public boolean removeElement(T element){

        return list.remove(element);
    }

    public T getElement(int index) {

        return list.get(index);
    }

    @Override
    public String toString() {
        return "GenericList{" +
                "list=" + list +
                '}';
    }
}
