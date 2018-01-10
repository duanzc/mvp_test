package com.dell.mvp_test.login.login.presenter;

import android.util.Log;

import com.dell.mvp_test.login.login.model.LoginModel;
import com.dell.mvp_test.login.login.model.LoginOnclickListener;
import com.dell.mvp_test.login.login.model.modelimpl.LoginModelImpl;
import com.dell.mvp_test.login.login.view.LoginView;

/**
 * 最重要的一环、 关联 view 和 model
 * Created by dell on 2018/01/10.
 */

public class LoginPresenter implements LoginOnclickListener {

    LoginView loginView;
    LoginModel loginModel;

    public static final String TAG = "duanc";

    public LoginPresenter(LoginView view) {
        this.loginView = view;
        loginModel = new LoginModelImpl();
    }

    public void login() {
        String name = loginView.getName();
        String password = loginView.getPassword();
        Log.i(TAG, "login: " + name + password);
        loginModel.login(name, password, this);

    }


    @Override
    public void onError() {
        loginView.showInfo("错误");
    }

    @Override
    public void onSuccess() {
        loginView.onSuccess();
    }


}
