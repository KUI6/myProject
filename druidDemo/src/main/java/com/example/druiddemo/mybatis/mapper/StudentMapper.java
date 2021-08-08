package com.example.druiddemo.mybatis.mapper;

import com.example.druiddemo.mybatis.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StudentMapper {
    public List<Student> selectAllStudent();
}
