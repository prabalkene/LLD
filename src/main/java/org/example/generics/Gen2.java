package org.example.generics;

public class Gen2<X>{

    private  X a;

    public void gen2(){
        System.out.println("In gen2: " + a);
    }
    public void seta(X n){
        this.a = n;
    }
}
