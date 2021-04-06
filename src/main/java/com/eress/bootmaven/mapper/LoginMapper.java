package com.eress.bootmaven.mapper;

import com.eress.bootmaven.model.UserDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {

    UserDTO getUserInfo(UserDTO resUser) throws Exception;
}
