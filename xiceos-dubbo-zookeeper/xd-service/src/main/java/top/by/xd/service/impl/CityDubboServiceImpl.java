package top.by.xd.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.by.xd.dao.CityDao;
import top.by.xd.entity.City;
import top.by.xd.service.CityDubboService;

@Component
@Service(version = "1.0.0", timeout = 10000, interfaceClass =  CityDubboService.class)
public class CityDubboServiceImpl implements CityDubboService {

    @Autowired
    private CityDao cityDao;

    @Override
    public City findCityByName(String cityName) {
        City city = new City();

        city.setId(1L);
        city.setCityName("珠海市");
        city.setProvinceId(12306L);
        city.setDescription("珠海市城市描述");

        return city;
    }
}
