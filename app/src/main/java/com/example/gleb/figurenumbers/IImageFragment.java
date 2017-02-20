package com.example.gleb.figurenumbers;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.io.File;

public class IImageFragment extends BaseFragment implements IImageFragmentView {
    private final String LOG_TAG = this.getClass().getCanonicalName();
    private ImageView imageView;
    private IImageFragmentPresenter presenter = new ImageFragmentPresenter(this);

    public static IImageFragment getInstance() {
        IImageFragment imageFragment = new IImageFragment();
        return imageFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_image, container, false);
        initWidgets(view);

        return view;
    }


    @Override
    public void initWidgets(View view) {
        imageView = (ImageView) view.findViewById(R.id.image);
    }

    @Override
    public void onStart() {
        super.onStart();
        presenter.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        presenter.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }
}
