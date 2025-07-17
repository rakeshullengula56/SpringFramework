package com.ram;

public class Desktop implements Computer {
    String ram="8GB";
    public Desktop(){
        System.out.println("Desktop object is created");
    }
    @Override
    public void compile() {
        System.out.println("compiling in desktop");
    }
}
