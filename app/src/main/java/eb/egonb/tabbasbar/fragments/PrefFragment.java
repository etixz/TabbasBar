package eb.egonb.tabbasbar.fragments;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import eb.egonb.tabbasbar.R;

public class PrefFragment extends PreferenceFragmentCompat {
    public static PrefFragment newInstance(){
        return new PrefFragment();
    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }
}
