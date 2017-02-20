package com.example.gleb.figurenumbers;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class FragmentHelper {
    private static FragmentHelper instance = null;
    private Context context;

    public static FragmentHelper getInstance(Context context) {
        if (instance == null)
            instance = new FragmentHelper(context);
        return instance;
    }

    private FragmentHelper(Context context) {
        this.context = context;
    }

    public void addFragment(BaseFragment fragment, FragmentActivity activity, int resId){
        FragmentManager fm = activity.getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(resId, fragment).addToBackStack(null).commit();
    }
}
