package com.ems.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      HelloWorld obj1 = (HelloWorld) context.getBean("hello1");
      obj.getMessage();
      obj1.getMessage();
      
   }
}