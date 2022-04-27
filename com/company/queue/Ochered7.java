package com.company.queue;

public class Ochered7 extends Exception {
    int size;
    public Ochered7(int s) {size=s;}

    public String toString() {
        return "\n очередь переполнена. Максимальный размер = " + size;
    }
}