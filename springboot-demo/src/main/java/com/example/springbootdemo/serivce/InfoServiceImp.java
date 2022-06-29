package com.example.springbootdemo.serivce;


import com.example.springbootdemo.dao.InfoDao;
import com.example.springbootdemo.po.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class InfoServiceImp implements InfoService {

    @Autowired
    private InfoDao infoDao;

    @Override
    public Info findOne(String username,String password,Integer permission) {
        return this.infoDao.findOne(username,password,permission);
    }

    @Override
    public void addOne(Info info) {
        this.infoDao.addOne(info);
    }

    @Override
    public void updateInfo(Info info) {
        this.infoDao.updateInfo(info);
    }

}
