package com.eress.bootmaven.service;

import com.eress.bootmaven.model.UserDTO;

public interface LoginService {

    UserDTO getUserInfo(UserDTO reqUser);
    String loginCheck(UserDTO reqUser, UserDTO resUser);
}
