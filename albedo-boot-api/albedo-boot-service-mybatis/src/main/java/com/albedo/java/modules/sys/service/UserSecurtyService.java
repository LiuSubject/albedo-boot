package com.albedo.java.modules.sys.service;

import com.albedo.java.common.persistence.service.DataVoService;
import com.albedo.java.modules.sys.domain.User;
import com.albedo.java.modules.sys.repository.UserRepository;
import com.albedo.java.vo.sys.UserVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service class for managing users.
 *
 * @author somewhere
 */
@Service
@Transactional
public class UserSecurtyService extends DataVoService<UserRepository, User, String, UserVo> {


    public Optional<User> findOneByLoginId(String loginId) {
        User user = null;
        try {
            user = repository.selectUserByLoginId(loginId);
        }catch (Exception e){
            log.error("{}",e);
            user = repository.selectUserByLoginId(loginId);
        }
        return user!=null ? Optional.of(user) : Optional.empty();
    }


}
