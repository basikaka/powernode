package com.hogrider;

import com.hogrider.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandLineRunnerApplication implements CommandLineRunner {

    @Autowired
    private HelloService helloService;

    public static void main(String[] args) {

        System.out.println("准备创建容器对象");
        //创建容器对象
        SpringApplication.run(CommandLineRunnerApplication.class, args);

        System.out.println("容器对象创建之后");


    }

    @Override
    public void run(String... args) throws Exception {

        //可以自定义操作，比如读取文件，连接数据库等
        System.out.println("在容器对象创建好，执行的方法");
        helloService.sayHello("野猪骑士");
    }
}
