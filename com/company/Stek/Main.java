package com.company.Stek;

import com.company.queue.Ochered1;
import com.company.queue.Ochered7;
import com.company.queue.Ochered8;
import com.company.queue.Ochered9;
import com.company.stack.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)  {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        int stackSize = 0;

        try{
            String name = reader.readLine();
            stackSize = Integer.parseInt(name);
        }catch (IOException exc){
            System.out.println("Не удалось прочитать данные из stdin");
            return;
        }catch (Exception exc){
            System.out.println(exc);
            return;
        }

        Ochered1 q1 = new Stack(stackSize);
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
