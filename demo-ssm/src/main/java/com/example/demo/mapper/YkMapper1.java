package com.example.demo.mapper;

import com.example.demo.pojo.Yk;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface YkMapper1 {

    @Select("select * from yk")
    List<Yk> listYks();
}
