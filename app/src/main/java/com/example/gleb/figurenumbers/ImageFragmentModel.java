package com.example.gleb.figurenumbers;

import android.graphics.Bitmap;
import android.util.Log;

public class ImageFragmentModel implements IImageFragmentModel {
    private final String LOG_TAG = this.getClass().getCanonicalName();
    private IImageFragmentPresenter presenter;
    private BitmapHelper helper = BitmapHelper.getInstance();

    public ImageFragmentModel(IImageFragmentPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void detectObjects() {
        Bitmap bitmap = helper.getBitmap("test.png");
        Log.d(LOG_TAG, String.format("Size width = %s height = %s", bitmap.getWidth(),
                bitmap.getHeight()));
        int[][] binaryPixels = helper.getPixels(bitmap);
        helper.getNumObjects(binaryPixels);
        helper.getMarkers(binaryPixels);
    }
}
