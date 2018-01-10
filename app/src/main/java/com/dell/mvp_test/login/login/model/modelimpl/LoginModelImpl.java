package com.dell.mvp_test.login.login.model.modelimpl;

import android.util.Log;

import com.dell.mvp_test.login.login.model.LoginModel;
import com.dell.mvp_test.login.login.model.LoginOnclickListener;

/**
 * 登录接口实现类
 * Created by dell on 2018/01/10.
 */

public class LoginModelImpl implements LoginModel {

    public static final String TAG="duanc";

    @Override
    public void login(String name, String pass, LoginOnclickListener listener) {
        Log.i(TAG, "login: "+name+pass);
        if (name.equals("123")) {
            if (pass.equals("123")) {
                listener.onSuccess();
            }
        } else {
            listener.onError();
        }
    }
}
