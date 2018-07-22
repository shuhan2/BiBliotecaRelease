package com.twu.biblioteca.Control.Cilent;

import com.twu.biblioteca.Control.Common;
import com.twu.biblioteca.Control.Control;
import com.twu.biblioteca.Entity.UserInfoEntity;
import com.twu.biblioteca.Exception.NotFoundException;
import com.twu.biblioteca.Repository.UserInfoRepository;

public class Log implements Control {
    private Common common = new Common();
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    private String account;
    public Boolean login(String account, String password) throws NotFoundException {
         UserInfoEntity user = common.findUserByaccount(this.account);
        if (user == null ) {
            throw new NotFoundException("User");
        }
        else{
            if(!user.getPassword().equals(this.password)){
               return false;
            }
            else{
                return true;
            }
        }

    }
    @Override
    public Control next(String input) throws NotFoundException{
        UserInfoRepository userInfoRepository = UserInfoRepository.getValues();
        try {
            if(login(account, password)) {
                return new CheckOutBook();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return null;
    }
}
