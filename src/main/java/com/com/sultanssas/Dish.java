package com.com.sultanssas;

import java.util.ArrayList;
import java.util.List;

public class Dish {
   private String name;
   private Type type;
   private double price;
   private List<String> ingredients;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Dish(String name, Type type, double price, List<String> ingredients) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", ingredients=" + ingredients +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
//    public List<String> addIngredient(String ingredient){
//        if(ingredient==null || ingredient.length()==0){
//            throw new IllegalArgumentException("Not a valid ingredient");
//        }
//        if(this.ingredients==null){
//            this.ingredients=new ArrayList<>();
//
//        }
    //}
}
