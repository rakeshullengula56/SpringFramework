package com.ram;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        //prototype scope example
        // Alien obj1=(Alien) context.getBean("alien1");
        // Alien obj2=(Alien) context.getBean("alien1");

        //setter injection
        // Alien obj1=(Alien) context.getBean("alien");
        // obj1.setAge(35);
        // System.out.println(obj1.getAge());
        // obj1.compile();
        // Laptop lap=obj1.geLaptop();
        // lap.run();
        // Alien obj2=(Alien) context.getBean("alien");
        // System.out.println(obj2.getAge());

//        Alien obj1=(Alien) context.getBean("alien");
//        getBean by type
        Alien obj1=context.getBean("alien", Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();

    }
}
