package com.springinaction.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.springidol.Performer;

public class SpringInActionTest2 {
  private final static String location="xml/spring-idol.xml";
  private String beanName="";

  public static void main(String[] args) {
    ApplicationContext ctx=new ClassPathXmlApplicationContext(location);//ClassPathXmlApplicationContext默认是classpath路径下
//    String beanName="duke";
    String beanName="poeticDuke";
    
    Performer performer=(Performer) ctx.getBean(beanName);//根据bean名字反射实例化对象
    performer.perform();
  }

}
