package com.company.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortowanieDanych {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(3);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }

}
