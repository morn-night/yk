package com.example.demo.service.impl;


import com.example.demo.mapper.YkMapper;
import com.example.demo.pojo.Yk;
import com.example.demo.service.YkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YkServiceImpl implements YkService {

    @Autowired
    private YkMapper ykMapper;

    @Override
    public List<Yk> listYks() {
        return ykMapper.listYks();
    }

    @Override
    public int addYk(Yk yk) {
        return ykMapper.addYk(yk);
    }

    @Override
    public Yk getImgById(Integer id) {
        return ykMapper.getImgById(id);
    }

    @Override
    public int deleteById(Integer id) {
        return ykMapper.deleteById(id);
    }


}
