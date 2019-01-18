package top.by.xd.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.by.xd.entity.User;
import top.by.xd.service.UserDubboService;

@RestController
public class RemoteUserController {

    // , url = "dubbo://192.168.0.243:20881"
    @Reference(version = "1.0.0")
    private UserDubboService userDubboService;

    @RequestMapping(value="/dubbo/user/{id}")
    public User sayHello(@PathVariable("id") Long id){
        User user = userDubboService.findUserById(1L);
        return user;
    }

}
