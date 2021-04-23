package com.delta.familyradar;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;

public class SettingsFragment extends PreferenceFragmentCompat {
    private ToolbarPreference toolbar;
    private PreferenceScreen accountPreference;
    private PreferenceScreen managePrefrence;
    private PreferenceScreen memberPrefrence;
    private final int ACCOUNT = 1;
    private final int MANAGEGROUPS = 2;
    private final int MEMBERSHIPS = 3;

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);


        accountPreference = this.findPreference(getString(R.string.account));
        managePrefrence = this.findPreference(getString(R.string.manage));
        memberPrefrence = this.findPreference(getString(R.string.member));
        toolbar = findPreference("toolbar");
        toolbar.back(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavDirections action = SettingsFragmentDirections.actionSettingsFragmentToMainFragment();
                Navigation.findNavController(getParentFragment().getView()).navigate(action);

            }
        });
        toolbar.setTitle("Setting");


        accountPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                openAccountSettingFragment(ACCOUNT);
                return true;
            }
        });
        managePrefrence.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                openAccountSettingFragment(MANAGEGROUPS);
                return true;
            }
        });
        memberPrefrence.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                openAccountSettingFragment(MEMBERSHIPS);
                return true;
            }
        });
    }

    private void openAccountSettingFragment(int num) {
        NavDirections action;

        switch (num) {
            case 1:
                action = SettingsFragmentDirections.actionSettingsFragmentToAccountSettingFragment();
                break;
            case 2:
                action = SettingsFragmentDirections.actionSettingsFragmentToAccountSettingFragment();
                break;
            case 3:
                action = SettingsFragmentDirections.actionSettingsFragmentToAccountSettingFragment();
                break;
            default:
                action = SettingsFragmentDirections.actionSettingsFragmentToAccountSettingFragment();
                break;

        }
        Navigation.findNavController(getParentFragment().getView()).navigate(action);
    }

    @Override
    public void onResume() {
        super.onResume();

    }
}