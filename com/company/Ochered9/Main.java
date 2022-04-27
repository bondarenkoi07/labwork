package com.company.Ochered9;

import com.company.queue.Ochered7;
import com.company.queue.Ochered8;
import com.company.queue.Ochered9;

class Ochered10 {
    public static void main(String[] args) {
        Ochered9 q1 = new Ochered9(10);
        char ch;
        int i;
        try {
            for(i=0; i<11; i++) {
                System.out.print("Попытка сохранения : " + (char) ('A' + i));
                q1.put((char) ('A'+i));
                System.out.print(" - ОК ");
            }
            System.out.println();
        }
        catch (Ochered7 exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for(i=0; i<11; i++) {
                System.out.print("Получение следующего символа: ");
                ch = q1.get();
                System.out.println(ch);
            }}
        catch (Ochered8 exc) {
            System.out.println(exc);
        }
    }
}