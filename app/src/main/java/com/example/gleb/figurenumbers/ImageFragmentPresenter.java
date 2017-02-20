package com.example.gleb.figurenumbers;

public class ImageFragmentPresenter implements IImageFragmentPresenter {
    private final String LOG_TAG = this.getClass().getCanonicalName();
    private IImageFragmentModel model;
    private IImageFragmentView view;

    public ImageFragmentPresenter(IImageFragmentView view) {
        this.view = view;
        this.model = new ImageFragmentModel(this);
    }

    @Override
    public void onStart() {
        model.detectObjects();
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void initDetectImage() {

    }
}
