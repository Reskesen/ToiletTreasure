package com.example.theis.toilettreasure;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.MenuInflater;
import android.view.Window;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

public class StartActivity extends FragmentActivity {

    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Display display = getWindowManager().getDefaultDisplay();
        int height = display.getHeight();
        Bundle arg = new Bundle();
        arg.putInt("height", height);


        if (savedInstanceState == null) {
            android.support.v4.app.Fragment fragment = new Startup();
            fragment.setArguments(arg);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.hovedlayout, fragment) // tom container i layout
                    .commit();
        }

    }


}