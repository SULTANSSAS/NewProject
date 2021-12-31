package com.pppp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class People {
   private String name;
   private Date dateOfBirth;
    SimpleDateFormat form=new SimpleDateFormat("dd-MM-yyy");

    public People(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + form.format(dateOfBirth) +
                '}';
    }
}
