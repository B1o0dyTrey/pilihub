package cn.tjpu.pilihub.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.sql.Date;

/**
 * @Author FY
 * @Date 2021/10/30 10:04
 * @Version 1.0
 */

@TableName(value = "user")
public class User {
    //自增id
    private int id;
    //昵称 不做登录
    private String username;
    //密码
    private String password;
    //登录手机号 唯一标识
    @TableField(value="phone_number",exist = true)
    private String phoneNumber;
    //注册日期
    @TableField(value="register_date",exist = true)
    private Date registerDate;
    //自我介绍
    @TableField(value="self_introduction",exist = true)
    private String selfIntroduction;
    //用户权限 0-1
    private int authority;
    //用户头像url
    private String avatar_url;
    //封号标识 0-1
    private int status;

    //md5加密盐值 暂定未选
//    private String salt;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getSelfIntroduction() {
        return selfIntroduction;
    }

    public void setSelfIntroduction(String selfIntroduction) {
        this.selfIntroduction = selfIntroduction;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
