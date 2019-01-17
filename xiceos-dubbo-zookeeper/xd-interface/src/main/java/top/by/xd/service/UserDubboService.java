package top.by.xd.service;

import top.by.xd.entity.User;

/**
 * <p>Title: UserDubboService</p>
 * <p>Description: 用户业务 Dubbo 服务层</p>
 *
 * @author zwp
 * @date 2019/1/17 21:23
 */
public interface UserDubboService {

    /**
     * 根据用户ID，查询用户信息
     *
     * @param id
     * @return
     */
    User findUserById(Long id);

}
