package org.example.gayathri.myfirstapp.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.example.gayathri.myfirstapp.R;

public class LoginActivity extends AppCompatActivity implements LoginContract.View{

    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        presenter = new LoginPresenter(this);
    }
}
