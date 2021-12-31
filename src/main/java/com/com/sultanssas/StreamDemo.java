package com.com.sultanssas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class StreamDemo {
    FileInputStream fis=new FileInputStream("E:/OneDrive/Documents/Alice.txt");
    byte b[]= fis.readAllBytes();
    String s=new String(b);
    public StreamDemo() throws Exception{}


    public static void main(String[] args) throws Exception {
        StreamDemo sd=new StreamDemo();
        String ss=sd.s;

        long c = Arrays.asList(ss.split(" ")).stream().filter(a->a.equalsIgnoreCase("Alice")).count();
        long c1 = Arrays.asList(ss.split(" ")).stream().filter(a -> a.startsWith("a") || a.startsWith("A")).count();
        System.out.println(c+" "+c1);
    }
}
