package com.fire.list1;

import com.fire.list.Iterator;

public interface List {

    public int size();

    public boolean isEmpty();

    public Object remove(int index);

    public Node get(int index);

    public void add(Object e);

    public void add(int index, Object e);

    public boolean contains(Object e);

    public int indexOf(Object e);

    public Iterator iterator();

}
