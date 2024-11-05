package com.fire.list1;

import com.fire.list.Iterator;

public class SingleLinkedList implements List {
    private Node head;

    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public Node get(int index) {

        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("索引越界:" + index);
        }

        Node p = head;

        for (int j = 0;j <= index;j++){
            p = p.next;
        }

        return p;

    }

    @Override
    public Object remove(int index) {
        Node p = head;
        if (index > 0){
            p = get(index-1);
        }
        Node currNode = p.next;

        p.next = p.next.next;

        currNode.next = null;

        size--;

        return null;
    }

    @Override
    public void add(Object e) {
        add(size,e);


    }

    @Override
    public void add(int index, Object e) {
        Node p = head;

        if(index > 0){
            p = get(index-1);

        }

        Node newNode = new Node(e);

        newNode.next = p.next;
        p.next = newNode;

        size++;


    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node p = head;
        for (int i = 0;i<size;i++){
            p = p.next;
            sb.append(p.data+",");
        }
        if(size != 0){
            sb.deleteCharAt(sb.length()-1);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean contains(Object e) {
        return indexOf(e)>=0;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
