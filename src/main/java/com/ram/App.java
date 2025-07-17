package com.ram;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        //default name of your bean is name of your bean creating method
        //Desktop dt=(Desktop) context.getBean("desktop");

        //com2 is name of bean mentioned above bean creating method using @Bean(name="com2")
        //By default scope of bean is singleton
        Desktop dt= context.getBean("com2", Desktop.class);
        dt.ram="16GB";
        System.out.println(dt.ram);
        dt.compile();

        //made it prototype using @Scope("prototype") on bean definition method
        Desktop dt2= context.getBean("com2", Desktop.class);
        System.out.println(dt2.ram);
        dt2.compile();









        //ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
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

        //Alien obj1=(Alien) context.getBean("alien");
        //getBean by type
        //Alien obj1=context.getBean("alien", Alien.class);
        //System.out.println(obj1.getAge());
        //obj1.code();

    }
}
