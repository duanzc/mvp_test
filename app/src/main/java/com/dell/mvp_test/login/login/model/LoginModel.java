package com.dell.mvp_test.login.login.model;

/**
 * 定义model接口 、 实现登录
 * Created by dell on 2018/01/10.
 */

public interface LoginModel {

    void login(String name, String pass, LoginOnclickListener listener);

}
