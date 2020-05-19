package org.example;

import org.apache.log4j.PropertyConfigurator;
import org.example.homework.hk15052020.Action;
import org.example.homework.hk15052020.CauThu;
import org.example.homework.hk15052020.VanDongVien;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Begin task-1
        Action ac = new Action();
        VanDongVien v = new VanDongVien("nganguyen", 26, 47f, 1.6f);
        v.print();

        CauThu c;
        ArrayList<CauThu> cauThus = new ArrayList<>();
        c = new CauThu("nganguyen", 26, 47f, 1.6f, "abc", 10000);
        cauThus.add(c);
        c = new CauThu("datngo", 24, 57f, 1.6f, "abc", 20000);
        cauThus.add(c);
        c = new CauThu("chuyennguyen", 30, 57f, 1.63f, "abc", 30000);
        cauThus.add(c);
        c = new CauThu("hoanhp", 25, 65f, 1.78f, "abc", 10000);
        cauThus.add(c);

        // print
        System.out.println("--------- Hiện thị danh sách chưa sắp xếp -------------");
        ac.printArray(cauThus);

        //sort and print
        System.out.println("--------- Hiện thị danh sách đã sắp xếp -------------");
        ac.sapxep(cauThus);
        ac.printArray(cauThus);
        //End
    }
}
