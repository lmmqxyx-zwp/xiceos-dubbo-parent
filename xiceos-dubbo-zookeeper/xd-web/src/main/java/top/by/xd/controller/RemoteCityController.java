package top.by.xd.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.by.xd.entity.City;
import top.by.xd.service.CityDubboService;

@RestController
public class RemoteCityController {

    // , url = "dubbo://192.168.0.243:20881"
    @Reference(version = "1.0.0")
    private CityDubboService cityDubboService;

    @RequestMapping(value="/dubbo/city/{cityName}", method = RequestMethod.GET)
    public City sayHello(@PathVariable("cityName") String cityName){
        City city = cityDubboService.findCityByName(cityName);
        return city;
    }
}
