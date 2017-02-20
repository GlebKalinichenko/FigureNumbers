package com.example.gleb.figurenumbers;

public interface IImageFragmentPresenter {
    void onStart();
    void onResume();
    void onPause();
    void onDestroy();
    void initDetectImage();
}
