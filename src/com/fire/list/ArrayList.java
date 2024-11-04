package com.fire.list;

import java.util.Arrays;

public class ArrayList implements List {

    // ArrayList底层是一个长度可以动态增长的数组 elementData是数组的引用
    private transient Object[] elementData;
    // 集合中元素的个数,不是数组空间的容量
    private int size;

    public ArrayList() {
        this(10);
    }

    public ArrayList(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }




    @Override
    public int size() {
        return size;
    }



    @Override
    public void add(Object e) {

        if (size == elementData.length) {
            grow();
        }

        elementData[size++] = e;


    }

    @Override
    public void add(int index, Object e) {
        if (size == elementData.length) {
            grow();
        }

        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }

        elementData[index] = e;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elementData[i]+",");
        }

        if(size > 0){
            sb.deleteCharAt(sb.length()-1);
        }
        sb.append("]");
        return sb.toString();
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        Object[] newElementData = new Object[newCapacity];

        for (int i = 0; i < elementData.length; i++) {
            newElementData[i] = elementData[i];
        }

        elementData = newElementData;

//        elementData = Arrays.copyOf(elementData, elementData.length * 2);
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public Object get(int index) {
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException("数组索引越界:"+index);
        }
        return elementData[index];
    }


}
