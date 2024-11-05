package com.fire.list2;

import com.fire.list.Iterator;
import com.fire.list1.Node;

public interface List {

    public int size();

    public boolean isEmpty();

    public Object remove(int index);

    public Object get(int index);

    public void add(Object e);

    public void add(int index, Object e);

    public boolean contains(Object e);

    public int indexOf(Object e);

    public Iterator iterator();

}
