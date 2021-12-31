package com.sultanssa.in;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TestMain {
    public static void main(String[] args) {
List<Integer> l= Arrays.asList(6,4,7,8,2,4,1,3,12);
List<String> ll=Arrays.asList("AHHD","AHDGU","IUYY","DUU");
l.sort((n1,n2)->n1-n2);
ll.sort(String::compareTo);
        System.out.println(ll);



        //System.out.println(ip.play("",""));
    }

}
