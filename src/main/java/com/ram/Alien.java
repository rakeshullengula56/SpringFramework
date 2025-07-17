package com.ram;

// import java.beans.ConstructorProperties;

public class Alien {
    private int age ;
    private Computer com;

    // private Laptop laptop;

    public Alien(){
        // System.out.println("Alien object is created");
    }
    // @ConstructorProperties({"age","laptop"})
    // public Alien(Laptop laptop,int age){
    //     System.out.println("Alien object is created");
    //     this.laptop=laptop;
    //     this.age=age;
    // }

    public void setCom(Computer com){
        this.com=com;
    }

    public Computer getCom(){
        return com;
    }
    public void setAge(int age){
        // System.out.println("Setter is called");
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void code(){
        System.out.println("Coding....");
        com.compile();
    }

    // public Laptop geLaptop(){
    //     return laptop;
    // }
    // public void setLaptop(Laptop laptop){
    //     System.out.println("Setter is called");
    //     this.laptop=laptop;
    // }
}

