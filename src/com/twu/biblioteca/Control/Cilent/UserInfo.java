package com.twu.biblioteca.Control.Cilent;

import com.twu.biblioteca.Control.Control;
import com.twu.biblioteca.Entity.UserInfoEntity;
import com.twu.biblioteca.Exception.NotFoundException;
import com.twu.biblioteca.Repository.UserInfoRepository;

import java.util.List;
import java.util.Scanner;

public class UserInfo implements Control{
    private Log log = new Log();
    private UserInfoRepository userInfoRepository = UserInfoRepository.getValues();
    private List<UserInfoEntity> userList  =userInfoRepository.getUserInfoExtityList();
    @Override
    public Control next(String input) throws NotFoundException {
        Scanner inp = new Scanner(System.in);
        String account = inp.nextLine();
        String password = inp.nextLine();
        if (log.login(account, password)) {
            for (UserInfoEntity user : userList) {
                if (user.getAccount().equals(log.getAccount())) {
                    System.out.println(user);
                }
                else {
                    System.out.println("Your password is false!");
                }
            }
        }
        return new Menu();
    }

}
