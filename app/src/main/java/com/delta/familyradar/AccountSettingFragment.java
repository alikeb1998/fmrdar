package com.delta.familyradar;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.preference.PreferenceFragmentCompat;

public class AccountSettingFragment extends PreferenceFragmentCompat {
    private ToolbarPreference toolbar;
    private Bitmap imageBitmap;
    ImageViewPrefrence imageViewPreference;
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.acc_prefrence, rootKey);
//        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Account Setting");
        imageViewPreference = findPreference("image_preference");
        toolbar = findPreference("toolbarAcc");
        toolbar.setTitle("Account Setting");
        toolbar.back(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavDirections action = AccountSettingFragmentDirections.actionAccountSettingFragmentToSettingsFragment();
                Navigation.findNavController(getParentFragment().getView()).navigate(action);
            }
        });
        imageViewPreference.setImageClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "fuck", Toast.LENGTH_SHORT).show();
            }
        });
    }
}