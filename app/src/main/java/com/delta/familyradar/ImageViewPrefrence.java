package com.delta.familyradar;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;

class ImageViewPrefrence extends Preference {
    private ImageView imageView;
    private TextView textView;
    private Bitmap imageBitmap;
    View.OnClickListener clickListener;
    public ImageViewPrefrence(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onBindViewHolder(PreferenceViewHolder holder) {
        super.onBindViewHolder(holder);
        imageView = (ImageView) holder.findViewById(R.id.cusImage);
        textView = (TextView) holder.findViewById(R.id.cusName);
        imageView.setOnClickListener(clickListener);
        imageView.setImageBitmap(imageBitmap);
    }
    public void setImageClickListener(View.OnClickListener onClickListener)
    {
        clickListener = onClickListener;
    }

    public void setBitmap(Bitmap bitmap)
    {
        imageBitmap = bitmap;
    }
}
