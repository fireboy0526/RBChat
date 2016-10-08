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

public class Register_Tab2_OtherRegister extends Fragment implements View.OnClickListener, GoogleApiClient.OnConnectionFailedListener {

    //Signing Options
    private GoogleSignInOptions gso;

    //google api client
    private GoogleApiClient mGoogleApiClient;

    //Signin constant to check the activity result
    private int RC_SIGN_IN = 100;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail()
                                                                                  .requestId()
                                                                                  .build();

        mGoogleApiClient = new GoogleApiClient.Builder(getActivity())
                .enableAutoManage(getActivity() /* FragmentActivity */, this /* OnConnectionFailedListener */)
                .addApi(Auth.GOOGLE_SIGN_IN_API,gso)
                .build();
        //test
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstaceState) {
        //Set view and onClick listener
        View view = inflater.inflate(R.layout.account_register_others, container, false);

        //Google button
        com.google.android.gms.common.SignInButton login_button_google =
                (com.google.android.gms.common.SignInButton)view.findViewById(R.id.sign_in_button_google);
        login_button_google.setOnClickListener(this);

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
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            handleGoogleSignInResult(result);
        }
    }

    // handles Google Sign In Results
    private void handleGoogleSignInResult(GoogleSignInResult result) {
        Log.d("Google SignIn Result", "handleSignInResult:" + result.isSuccess());
        if (result.isSuccess()) {
            // Signed in successfolly, show authenticated UI.
            GoogleSignInAccount acct = result.getSignInAccount();

            Log.e("GSR Result", "Result: " + acct.getDisplayName() + ", " + acct.getEmail());
            //mStatusTextView.setText(getString(R.string.signed_in_fmt, acct.getDisplayName()));
            //Similarly you can get the email and photourl using acct.getEmail() and  acct.getPhotoUrl()

            //if(acct.getPhotoUrl() != null)
            //    new LoadProfileImage(imgProfilePic).execute(acct.getPhotoUrl().toString());

            //updateUI(true);
        } else {
            // Signed out, show unauthenticated UI.
            //updateUI(false);
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

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }
}
