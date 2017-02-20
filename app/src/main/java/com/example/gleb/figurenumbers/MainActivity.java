package com.example.gleb.figurenumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private final String LOG_TAG = this.getClass().getCanonicalName();
    private FragmentHelper fragmentHelper = FragmentHelper.getInstance(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment();
    }

    private void loadFragment(){
        BaseFragment fragment = IImageFragment.getInstance();
        fragmentHelper.addFragment(fragment, this, R.id.main_container);
    }
}
