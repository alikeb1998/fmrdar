package com.delta.familyradar;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;

class ToolbarPreference extends Preference {
    private Toolbar toolbar;
    private ImageView imageView;
    private TextView textView;
    private String tText;
    View.OnClickListener clickListener;

    public ToolbarPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onBindViewHolder(PreferenceViewHolder holder) {
        super.onBindViewHolder(holder);
        imageView = (ImageView) holder.findViewById(R.id.imageView8);
        imageView.setOnClickListener(clickListener);
        textView = (TextView) holder.findViewById(R.id.txtToolbar);
        textView.setText(tText);

//        toolbar.setTitleTextColor(Color.WHITE);
//      toolbar.setNavigationOnClickListener(clickListener);
//        toolbar.setNavigationOnClickListener(clickListener);
    }

    public void back(View.OnClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void setTitle(String title) {
        tText = title;
    }

}
