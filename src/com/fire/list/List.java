package com.fire.list;

public interface List {

    public int size();

    public boolean isEmpty();

    public Object get(int index);

    public void add(Object e);

    public void add(int index, Object e);

    public boolean contains(Object e);

    public int indexOf(Object e);

    public Iterator iterator();

}
