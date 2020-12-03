package com.erastimothy.laundry_app.UnitTest;

import com.erastimothy.laundry_app.dao.UserDao;

public interface LoginCallback {
    void onSuccess(boolean value, UserDao user);
    void onError();

}
