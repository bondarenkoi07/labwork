package com.company.stack;

import com.company.queue.Ochered1;
import com.company.queue.Ochered7;
import com.company.queue.Ochered8;

public class Stack implements Ochered1 {
    private final char[] q;
    private int size;

    public Stack(int size) {
        q=new char[size];
        this.size = -1;
    }
    public void put(char ch)
            throws Ochered7 {
        if(size==q.length-1)
            throw new Ochered7(q.length-1);
        size++;
        q[size]=ch;
    }
    public char get() throws Ochered8 {
        if (size<=0) {
            throw new Ochered8();
        }
        size--;
        return q[size];
    }
}

