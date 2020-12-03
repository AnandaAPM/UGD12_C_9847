package com.erastimothy.laundry_app.UnitTest;

import com.erastimothy.laundry_app.dao.UserDao;

public interface LoginView {
    String getNim();
    void showNimError(String message);
    String getPassword();
    void showPasswordError(String message);
    void startMainActivity();
    void startUserProfileActivity(UserDao user);
    void showLoginError(String message);
    void showErrorResponse(String message);
    void setResponse(String message);
}
