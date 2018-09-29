package org.example.gayathri.myfirstapp.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.example.gayathri.myfirstapp.R;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {

    private LoginPresenter mPresenter;

    private EditText etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);

        mPresenter = new LoginPresenter(this, new LoginInteractor());

        findViewById(R.id.btnLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.validateAndLogin(etUsername.getText().toString(), etPassword.getText().toString());
            }
        });

    }

    @Override
    public void setUsernameError() {
        etUsername.setError("Invalid username");
    }

    @Override
    public void setPasswordError() {
        etPassword.setError("Invalid password");
    }

    @Override
    public void goToMainActivity() {
        //Navigate to main activity
        Toast.makeText(this, "Navigating to Main Activity", Toast.LENGTH_SHORT).show();
    }
}
