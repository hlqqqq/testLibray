package com.hlq.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by heliqing on 2016/10/10.
 */
public class Test {
    public static void main(String[] args){
        List<String> list=new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        List<String> list2=new ArrayList<String>();
        list2.add("3");
        list2.add("5");
        list2.add("7");
        list2.removeAll(list);
        System.out.print(list2);
    }
}
