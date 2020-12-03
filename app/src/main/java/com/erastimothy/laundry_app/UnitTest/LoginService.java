package com.erastimothy.laundry_app.UnitTest;

import android.app.Activity;

import androidx.annotation.NonNull;

import com.erastimothy.laundry_app.dao.UserDao;
import com.erastimothy.laundry_app.model.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import retrofit2.Call;
import retrofit2.Callback;

public class LoginService {
    private FirebaseAuth mAuth;
    private Activity activity;
    public void login(final LoginView view, String email, String password,final LoginCallback callback){
        mAuth = FirebaseAuth.getInstance();
        mAuth.signInWithEmailAndPassword ( email,password )
                .addOnCompleteListener ( new OnCompleteListener<AuthResult> () {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful ()){
                            view.setResponse ( "Login berhasil" );
                        }
                    }
                } )
                .addOnFailureListener ( new OnFailureListener () {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        view.setResponse ( "Login Gagal" );
                    }
                } );
    }

    public Boolean getValid(final LoginView view, String nim, String
            password){
        final Boolean[] bool = new Boolean[1];
        login(view, nim, password, new LoginCallback() {
            @Override
            public void onSuccess(boolean value, UserDao user) {
                bool[0] = true;
            }
            @Override
            public void onError() {
                bool[0] = false;
            }
        });
        return bool[0];
    }
}
