package com.ram;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = {"com2","desktop1"})  //name of the Bean
    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }
    @Bean(name = {"com1","laptop1"})  //name of the Bean, we can use any name from those two or more
    public Laptop laptop(){
        return new Laptop();
    }
}
