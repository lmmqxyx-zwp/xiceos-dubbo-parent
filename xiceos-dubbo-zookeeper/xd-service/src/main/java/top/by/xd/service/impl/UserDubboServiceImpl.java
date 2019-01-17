package top.by.xd.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.by.xd.dao.UserDao;
import top.by.xd.entity.User;
import top.by.xd.service.UserDubboService;

import java.util.Date;

@Component
@Service(version = "1.0.0", timeout = 10000, interfaceClass =  UserDubboService.class)
public class UserDubboServiceImpl implements UserDubboService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findUserById(Long id) {

        User user = new User();

        user.setUserName("冰羽");
        user.setBirthday(new Date());

        return user;
    }
}
