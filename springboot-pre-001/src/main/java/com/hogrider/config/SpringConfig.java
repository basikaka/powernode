package com.hogrider.config;

import com.hogrider.vo.Cat;
import com.hogrider.vo.Student;
import org.springframework.context.annotation.*;

/**
 * @Configuration: 表示当前类为配置文件使用。就是用来配置文件的。
 *
 * SpringConfig这个类就相当于 beans.xml配置文件
 */
@Configuration
@ImportResource(value = "classpath:cat.xml")
@PropertySource(value = {"classpath:config.properties", "classpath:application.yml"})
@ComponentScan(basePackages = "com.hogrider.vo")
public class SpringConfig {

    /**
     *  创建方法，方法的返回值是对象。在方法上面添加 @Bean.
     *  方法的返回值对象，就注入到容器中。
     *
     * @Bean: 把对象注入到spring容器中。相当于<bean></bean>
     *      说明：如果不指定对象的名称，默认就用方法名作为Bean id.
     */
    @Bean
    public Student createStudent(){
        Student s1 = new Student();
        s1.setAge(29);
        s1.setName("milla");
        s1.setSex("女");
        return s1;
    }

    /**
     * 指定Bean对象的名称，就是（ <bean>的id属性</bean>）
     * */
    @Bean(name = "hill")
    public Student makeStudent(){
        Student s1 = new Student();
        s1.setAge(29);
        s1.setName("hill");
        s1.setSex("女");
        return s1;
    }

    @Bean
    public Cat sunCat(){
        Cat cat = new Cat();
        cat.setAge(5);
        cat.setName("Tom");

        return cat;
    }



}
