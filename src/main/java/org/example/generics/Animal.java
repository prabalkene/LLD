package org.example.generics;

import java.util.List;

public class Animal {


    public String eat() {
        System.out.println("Animal: eat");
        return "eats";
    }

    public void animals(List<? extends Animal> a1){
        for(Animal a: a1 ) {
            System.out.println("Animals: " + a.eat());
        }
    }
}
