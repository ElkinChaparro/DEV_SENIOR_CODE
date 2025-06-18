package com.devsenior.collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public void performDemo() {
        List list = new ArrayList();
        list.add (1);
        list.add (10);
        list.add ("Elkin");
        list.add (1, "DevSenior");

        for (var element : list) {
            System.out.println (element);
        }
    }
}