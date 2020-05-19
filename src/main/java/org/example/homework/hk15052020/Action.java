package org.example.homework.hk15052020;

import org.example.App;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Action {
    //Begin home work 15/05/2020.
    public void sapxep(ArrayList<CauThu> cauThus) {
        Collections.sort(cauThus, new Comparator<CauThu>() {
            @Override
            public int compare(CauThu c1, CauThu c2) {
                return c1.soSanh(c2);
            }
        });
    }

    public void printArray(ArrayList<CauThu> cauThus) {
        for (CauThu c: cauThus) {
            System.out.println("---------------" + "Cầu thủ thứ: " + cauThus.indexOf(c) + "----------------");
            c.print();
        }
    }
}
