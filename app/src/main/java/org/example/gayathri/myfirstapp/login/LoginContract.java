package org.example.gayathri.myfirstapp.login;

public interface LoginContract {

    interface View {

        void setUsernameError();

        void setPasswordError();

        void goToMainActivity();

    }

    interface Presenter {

        void validateAndLogin(String username, String password);
    }

    interface Interactor {

        interface OnLoginListener {

            void onSuccess();

            void onPasswordError();

            void onUsernameError();

        }

        void login(String username, String password, OnLoginListener listener);

    }
}
