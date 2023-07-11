package edu.ustb.blog.entity;

import java.util.Date;


/**
 * (User)表实体类
 *
 * @author makejava
 * @since 2023-07-11 00:05:01
 */

public class User  {
    //用户id  主键@TableId
    private Integer id;

    //用户账号
    private String account;
    //用户密码
    private String password;
    //盐值
    private String salt;
    //用户手机号
    private String phone;
    //用户邮箱
    private String email;
    //用户性别 0-女 1-男 2-未知
    private Integer sex;
    //用户简介
    private String biography;
    //用户头像
    private String image;
    //用户状态 0-正常 1-已禁用
    private Integer state;
    //用户权限 1-普通用户 2-审核员 3-管理员
    private Integer privileges;
    //创建时间
    private Date createtime;

    private String userNick;

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Integer privileges) {
        this.privileges = privileges;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}

