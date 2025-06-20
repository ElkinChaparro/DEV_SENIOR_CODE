package com.devsenior.NikleG.collections;

import java.util.*;

public class Lists {

    public void performDemo() {
        List <Number>list = new LinkedList();
        list.add (1);
        list.add (10);
        list.add (25L);
        list.add (1, 28);

        for (var element : list) {
            System.out.println (element);
        }
    }
}