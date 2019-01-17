package top.by.xd.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * <p>Title: City</p>
 * <p>Description: 城市实体类</p>
 *
 * @author zwp
 * @date 2019/1/17 14:27
 */
@Entity
@Table(name = "t_city")
public class City implements Serializable {

    /**
     * 城市编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 10)
    private Long id;

    /**
     * 省份编号
     */
    @Column(length = 10)
    private Long provinceId;

    /**
     * 城市名称
     */
    @Column(length = 32)
    private String cityName;

    /**
     * 描述
     */
    @Column(length = 255)
    private String description;

    public City() {
    }

    public City(Long id, Long provinceId, String cityName, String description) {
        this.id = id;
        this.provinceId = provinceId;
        this.cityName = cityName;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
