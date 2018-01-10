package com.dell.mvp_test.login.login.view;

/**
 * 定义登录界面要做的事情、 获取账号 和密码
 * Created by dell on 2018/01/10.
 */

public interface LoginView {

    String getName();

    String getPassword();

    void showInfo(String msg);

    void onSuccess();
}
