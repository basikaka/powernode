package com.hogrider.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {

    @GetMapping("/student/{stuId}")
    public String  doSomething( @PathVariable("stuId") Integer studentID){
        return  "查询资源，执行get操作。查询学生的号是=" + studentID;
    }

    @PostMapping("/student/{name}/{age}")
    public String addStudent( @PathVariable("name") String name ,
                              @PathVariable("age") Integer age){
        return "添加资源，执行post请求。学生姓名=" + name + "#年龄=" + age;

    }

    /**
     *
     *  当路径变量的名称和形参名称一样的时候，@PathVariable里的value可以省略
     */
    @PutMapping("/student/{id}/{age}")
    public String modifyStudent(@PathVariable Integer id ,
                                @PathVariable Integer age){
        return "更新资源，执行put操作。修改学生号：" + id + " 年龄为：" + age;
     }

     @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable Integer id ){
        return  "删除资源，执行delet操作。删除学生号=" + id;
     }
}
