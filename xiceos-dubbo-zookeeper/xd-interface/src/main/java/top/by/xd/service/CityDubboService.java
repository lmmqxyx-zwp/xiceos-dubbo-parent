package top.by.xd.service;

import top.by.xd.entity.City;

/**
 * <p>Title: CityDubboService</p>
 * <p>Description:  城市业务 Dubbo 服务层</p>
 *
 * @author zwp
 * @date 2019/1/17 14:29
 */
public interface CityDubboService {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName
     * @return
     */
    City findCityByName(String cityName);

}
