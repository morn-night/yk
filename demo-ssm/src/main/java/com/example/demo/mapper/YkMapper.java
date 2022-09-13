package com.example.demo.mapper;

import com.example.demo.pojo.Yk;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface YkMapper {
    @Select("select * from yk")
    List<Yk> listYks();

    //增加用户
    @Insert("insert into yk(id,name,sex,img) values(#{id},#{name},#{sex},#{img})")
    int addYk(Yk yk);

    @Select("select img from yk where id=#{id}")
    Yk getImgById(Integer id);

    @Delete("delete from yk where id=#{id}")
    int deleteById(Integer id);

    @Update("update yk set name=#{name},sex=#{sex} where id=#{id}")
    int updateYk(Yk yk);

    @Select("select * from yk where id=#{id}")
    Yk queryById(int id);

    //查询分页总数
    @Select("select count(*) from yk")
    int countYks();
    //分页
    @Select("select * from yk limit #{startIndex},#{pageSize}")
    List<Yk> getYksList(@Param("startIndex") int startIndex,@Param("pageSize") int pageSize);

}