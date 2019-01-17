package top.by.xd.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title: User</p>
 * <p>Description: 用户实体类</p>
 *
 * @author zwp
 * @date 2019/1/17 15:11
 */
@Entity
@Table(name = "t_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 10)
    private Long id;

    @Column(length = 32)
    private String userName;


    @Column(length = 32)
    private String password;


    @Column(columnDefinition = "text")
    private String remark;

    private Date birthday;

    @Column(length = 1)
    private Character sex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }
}
