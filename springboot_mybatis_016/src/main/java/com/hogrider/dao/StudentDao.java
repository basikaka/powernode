package com.hogrider.dao;

import com.hogrider.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 告诉Mybatis，这个是Dao接口，需要创建次接口的代理对象
 * */
@Mapper
public interface StudentDao {

    Student selectById(@Param("StuId") Integer id);
}
