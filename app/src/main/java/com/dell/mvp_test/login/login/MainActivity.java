package com.dell.mvp_test.login.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dell.mvp_test.R;
import com.dell.mvp_test.login.login.presenter.LoginPresenter;
import com.dell.mvp_test.login.login.view.LoginView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, LoginView {

    EditText editText1, editText2;
    Button button;

    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.edit_name);
        editText2 = findViewById(R.id.edit_password);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);
        presenter = new LoginPresenter(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                presenter.login();
                break;
            default:
                break;
        }
    }

    @Override
    public String getName() {
        return editText1.getText().toString().trim();
    }

    @Override
    public String getPassword() {
        return editText2.getText().toString().trim();
    }

    @Override
    public void showInfo(String msg) {
        Toast.makeText(this, "" + msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSuccess() {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
    }
}
