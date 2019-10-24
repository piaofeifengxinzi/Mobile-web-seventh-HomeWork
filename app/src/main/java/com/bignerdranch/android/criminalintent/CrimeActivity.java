package com.bignerdranch.android.criminalintent;

import android.os.Bundle;
import android.util.Log;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;


public class CrimeActivity extends FragmentActivity {
    private String TAG = "CrimeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG,"执行onCreate()");
        setContentView(R.layout.activity_crime);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new CrimeFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.e(TAG,"执行onStart()");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.e(TAG,"执行onResume()");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.e(TAG,"执行onPause()");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.e(TAG,"执行onStop()");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.e(TAG,"执行onDestroy()");
    }


}
