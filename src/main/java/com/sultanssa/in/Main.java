package com.sultanssa.in;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Person p1=new Person("Sultan");
        Person p2=new Person("Sultan");
        Set<Person> h=new HashSet<Person>();
        System.out.println("//New Changes made");
h.add(p1);
h.add(p2);
        System.out.println(h);
    }
}
