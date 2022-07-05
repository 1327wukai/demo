package com.lianwei.OAsystem.serivce;


import com.lianwei.OAsystem.dao.InfoDao;
import com.lianwei.OAsystem.po.Info;
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
    public Info findOne(String username,String password) {
        return this.infoDao.findOne(username,password);
    }

    @Override
    public Info findUserIdByUsername(String username) {
        return this.infoDao.findUserIdByUsername(username);
    }

    @Override
    public void addOne(Info info) {
        this.infoDao.addOne(info);
    }

    @Override
    public void updateInfo(Info info) {
        this.infoDao.updateInfo(info);
    }

    @Override
    public List<Info> findUserById(Integer userId) {
        return this.infoDao.findUserById(userId);
    }

    @Override
    public List<Info> findAllUser(Info info) {
        return this.infoDao.findAllUser(info);
    }

}
