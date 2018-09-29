package org.example.gayathri.myfirstapp.login;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {

    private LoginPresenter presentor;
    @Mock
    private LoginContract.View view;
    @Mock
    private LoginContract.Interactor interactor;

    @Before
    public void setUp() throws Exception {
        presentor = new LoginPresenter(view, interactor);
    }

    @Test
    public void validateAndLogin() throws Exception {
        // Given

        // When
        presentor.validateAndLogin("username", "password");

        // Then
        Mockito.verify(interactor).login("username", "password", presentor);
    }

    @Test
    public void onUsernameError() throws Exception {
        // Given

        // When
        presentor.onUsernameError();

        // Then
        Mockito.verify(view).setUsernameError();
    }

    @Test
    public void onPasswordError() throws Exception {
        // Given

        // When
        presentor.onPasswordError();

        // Then
        Mockito.verify(view).setPasswordError();
    }

    @Test
    public void onSuccess() throws Exception {
        // Given

        // When
        presentor.onSuccess();

        // Then
        Mockito.verify(view).goToMainActivity();
    }
}