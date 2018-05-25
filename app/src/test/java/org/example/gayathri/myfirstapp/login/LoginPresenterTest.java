package org.example.gayathri.myfirstapp.login;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class LoginPresenterTest {

    private LoginPresenter mLoginPresentor;
    private LoginContract.View mView;
    private LoginContract.Interactor mInteractor;

    @Before
    public void setUp() throws Exception {
        mView = Mockito.mock(LoginContract.View.class);
        mInteractor = Mockito.mock(LoginContract.Interactor.class);
        mLoginPresentor = new LoginPresenter(this.mView, mInteractor);
    }

    @Test
    public void validateAndLogin() {
    }

    @Test
    public void onUsernameError() {
    }

    @Test
    public void onPasswordError() {
    }

    @Test
    public void onSuccess() {
    }
}