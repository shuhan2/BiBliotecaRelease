package com.twu.biblioteca.Repository;

import com.twu.biblioteca.Entity.UserInfoEntity;

import java.util.ArrayList;
import java.util.List;

public class UserInfoRepository {
    private List<UserInfoEntity> userInfoExtityList = new ArrayList<UserInfoEntity>();
    private static UserInfoRepository userInfoRepository = new UserInfoRepository();
    public List<UserInfoEntity> getUserInfoExtityList() {
        return userInfoExtityList;
    }

    public void setUserInfoExtityList(List<UserInfoEntity> userInfoExtityList) {
        this.userInfoExtityList = userInfoExtityList;
    }
    public UserInfoRepository(){
        userInfoExtityList.add(new UserInfoEntity(1,"QianWu","2472520654@qq.com",2512160,"1","1"));
    }
    public synchronized static UserInfoRepository getValues() {
        if (userInfoRepository == null) {
            userInfoRepository = new UserInfoRepository();
        }
        return userInfoRepository;
    }
}
