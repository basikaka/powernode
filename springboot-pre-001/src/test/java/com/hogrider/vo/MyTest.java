package com.hogrider.vo;

import com.hogrider.config.SpringConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {

    /**
     * 使用xml文件配置容器对象
     */
    @Test
    void Test01(){
        String config = "beans.xml";

        ApplicationContext ctx = new ClassPathXmlApplicationContext( config );
        System.out.println("容器中的对象： " + ctx.getBean( "goodStudent"));
    }

    /*
    * 使用JavaConfig
    * */
    @Test
    void Test02(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        System.out.println("使用JavaConfig创建的Bean，容器中的对象： " + ctx.getBean("sunCat"));
    }

    @Test
    void Test03(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        Student student = (Student) ctx.getBean("hill");
        System.out.println("使用JavaConfig创建的Bean，容器中的对象： " + student);
    }

    /*
    * 使用ImportResource 导入xml文件配置的bean对象
    **/
    @Test
    void Test04(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext( SpringConfig.class);
        System.out.println("使用ImportResource导入xml配置bean的容器对象：" + ctx.getBean("gorCat"));
    }

    @Test
    void Test05(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext( SpringConfig.class);
        System.out.println("使用propertysoruce 创建Bean对象：" + ctx.getBean("whitetiger"));
    }



}
