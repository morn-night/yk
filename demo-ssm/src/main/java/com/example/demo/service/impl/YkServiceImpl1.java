package com.example.demo.service.impl;



import com.example.demo.mapper.YkMapper1;
import com.example.demo.pojo.Yk;
import com.example.demo.service.YkService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YkServiceImpl1 implements YkService1 {

    @Autowired
    private YkMapper1 ykMapper1;

    @Override
    public List<Yk> list() {
        return ykMapper1.listYks();
    }
}
