package org.example.generics;

public class Gen1<V> extends Gen2{


    private V b;

    public void gen1(){
        System.out.println("In gen1: " + b );
    }
    public void setb(V n){
        b = n;
    }
}
