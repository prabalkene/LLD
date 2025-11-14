package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal{

    void run() {
        System.out.println("Dog runs!");
    }

     @Override
    public  String eat() {
        System.out.println("Dog eat!");
        return "Dog eat";
     }

   public void getAdded(){
       List<Dog> d = new ArrayList<>();
       d.add(new Dog());
       d.add(new Dog());
       animals(d);

       List<Cat> c = new ArrayList<>();
       c.add(new Cat());
       c.add(new Cat());
       animals(c);
   }




}
