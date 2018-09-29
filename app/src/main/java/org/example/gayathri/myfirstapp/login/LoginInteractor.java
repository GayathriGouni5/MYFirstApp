package org.example.gayathri.myfirstapp.login;

public class LoginInteractor implements LoginContract.Interactor {

    @Override
    public void login(String username, String password, OnLoginListener listener) {
        if (username.trim().isEmpty())
            listener.onUsernameError();
        else if (password.trim().isEmpty())
            listener.onPasswordError();
        else {
            //Login code here
            listener.onSuccess();
        }
    }
}
