package com.example.demo.listtest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<ListEntity>lists=new ArrayList<ListEntity>();
        lists.add(new ListEntity("1",10));
        lists.add(new ListEntity("2",20));
        lists.add(new ListEntity("3",30));
        lists.add(new ListEntity("4",40));
        List<ListEntity>entities=new ArrayList<>();
        entities.add(new ListEntity("1",10));
        entities.add(new ListEntity("7",20));
       lists.sort(new Comparator<ListEntity>() {
           @Override
           public int compare(ListEntity o1, ListEntity o2) {
               return 0;
           }
       });


    }


}
