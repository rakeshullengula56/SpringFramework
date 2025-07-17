package com.ram;

public class Laptop implements Computer {

    @Override
    public void compile() {
        System.out.println("compiling in laptop");
    }

}