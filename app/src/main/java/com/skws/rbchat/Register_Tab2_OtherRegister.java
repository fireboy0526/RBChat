package com.skws.rbchat;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by Eric on 10/3/2016.
 */

public class Register_Tab2_OtherRegister extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstaceState) {
        // Set view and onClick listener
        View view = inflater.inflate(R.layout.account_register_others, container, false);

        // Buttons
        com.google.android.gms.common.SignInButton btnGoogleSignIn =
                (com.google.android.gms.common.SignInButton)view.findViewById(R.id.sign_in_button_google);
        btnGoogleSignIn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.sign_in_button_google:
                Log.d("Google SignIn Result", "CLICKKKKKKKKKKKKKKKK");
                //Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
                //startActivityForResult(signInIntent, RC_SIGN_IN);
                startActivity(new Intent(getActivity(), Activity_Google_Sign_In.class));
                break;
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        //mGoogleApiClient.connect();
    }

    @Override
    public void onStop() {
        super.onStop();
        //mGoogleApiClient.disconnect();
    }

}
