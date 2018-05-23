package org.example.gayathri.myfirstapp.login;

public class LoginPresenter implements LoginContract.Presenter, LoginContract.Interactor.OnLoginListener {

    private LoginContract.View view;
    private LoginContract.Interactor interactor;

    LoginPresenter(LoginContract.View view, LoginContract.Interactor interactor) {
        this.view = view;
        this.interactor = interactor;
    }

    @Override
    public void validateAndLogin(String username, String password) {
        interactor.login(username, password, this);
    }

    @Override
    public void onUsernameError() {
        view.setUsernameError();
    }

    @Override
    public void onPasswordError() {
        view.setPasswordError();
    }

    @Override
    public void onSuccess() {
        view.goToMainActivity();
    }


}
