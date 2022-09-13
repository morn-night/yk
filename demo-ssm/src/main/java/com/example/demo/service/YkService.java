package com.example.demo.service;


import com.example.demo.pojo.Yk;
import org.springframework.stereotype.Service;

import java.util.List;


public interface YkService {
    List<Yk> listYks();

    //增加用户
    int addYk(Yk yk);

    Yk getImgById(Integer id);

    int deleteById(Integer id);

    int updateYk(Yk yk);

    Yk queryById(int id);

    int countYk();

    List<Yk> getYksList(int startIndex,int pageSize);
}
