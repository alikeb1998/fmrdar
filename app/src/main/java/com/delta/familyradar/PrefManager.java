package com.delta.familyradar;

import android.content.Context;
import android.content.SharedPreferences;

class PrefManager {
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    private Context context;
    int privateMode = 0;
    private static final String PREF_NAME = "spotia-welcome";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager(Context context) {
        this.context = context;
        preferences = context.getSharedPreferences(PREF_NAME,privateMode);
        editor = preferences.edit();
    }
    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }
    public boolean isFirstTimeLaunch() {
        return preferences.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }
}
