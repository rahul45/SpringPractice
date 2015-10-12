package com.ems.drawing;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	public static void main(String args[]){
	/*	Triangle tri=new Triangle();
		tri.draw();*/
		/*BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));*/
		ApplicationContext factory=new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle=(Triangle)factory.getBean("triangle");
		/*Triangle triangle=(Triangle)factory.getBean("triangle.alias");*/
		triangle.draw();
	}
}
