package com.com.sultanssas;

import java.util.*;


public class TestMai {
    public static void main(String[] args) {
        List<Dish> ld= Arrays.asList(new Dish("dAL", Type.VEG,100.00,List.of("yellowDal","Onions","CuminSeeds")),
                                     new Dish("ButterChicken",Type.NON_VEG,120.00,List.of("Chicken","Onions","Masala")),
                                     new Dish("Samosa", Type.VEG,10.00,List.of("Potato","Flor","Mirch")));
List<Person> p=Arrays.asList(new Person("Guri",Arrays.asList(Arrays.asList("Java","c++","CSharp"))),
                             new Person("Suri",Arrays.asList(Arrays.asList("Python","React","NodeJS"))),
                             new Person("Turi",Arrays.asList(Arrays.asList("JavaScript","HTML","CSS"))));
        //ld.stream().flatMap(d->d.getIngredients().stream()).distinct().forEach(System.out::println);
      // List<String>  c = p.stream().flatMap(a -> a.getCourses().stream()).flatMap(l -> l.stream()).collect(Collectors.toList());
       // System.out.println(ld.stream().collect(Collectors.groupingBy(d -> d.getType())));
        //System.out.println(Arrays.asList(1, 2, 3, 4, 5).stream().reduce(0, (a, b) -> a + b));
       TestMai t=new TestMai();
        System.out.println(t.greet(null));


    }
    public Optional<String> greet(String abc){
        return null==abc?Optional.empty():Optional.of("Greetings"+abc);
    }
}
