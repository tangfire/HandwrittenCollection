package com.fire.list2;

import com.fire.list.Iterator;
import com.fire.list1.Node;

public class LinkedList implements List {


    transient int size = 0;

    transient Node first;

    transient Node last;

    private static class Node<E>{
        E item;
        Node<E> next;
        Node<E> prev;

        public Node(Node<E> prev,E item, Node<E> next) {
            this.prev = prev;
            this.item = item;
            this.next = next;

        }


    }



    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object get(int index) {
        return node(index).item;
    }

    @Override
    public void add(Object e) {
        LinkLast(e);
    }

    @Override
    public void add(int index, Object e) {
        if(index == size){
            LinkLast(e);
        }else{
            LinkBefore(e,node(index));
        }
    }

    /**
     * 查询指定索引的节点
     * @param index
     * @return
     */
    Node node(int index){
        if(index < (size >> 1)){
            Node x = first;
            for (int i = 0;i<index;i++){
                x = x.next;
            }
            return x;
        }else{
            Node x = last;
            for (int i = size-1;i>index;i--){
                x = x.prev;
            }
            return x;
        }
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public boolean contains(Object e) {
        return false;
    }

    void LinkLast(Object e){
        final Node l = last;
        final Node newNode = new Node<>(l,e,null);
        last = newNode;
        if(l==null){
            first = newNode;
        }else{
            l.next = newNode;
        }
        size++;

    }

    void LinkBefore(Object e,Node succ){
        final Node pred = succ.prev;
        final Node newNode = new Node<>(pred,e,null);
        succ.prev = newNode;
        if(pred==null){
            first = newNode;
        }else{
            pred.next = newNode;
        }
        size++;
    }
}
