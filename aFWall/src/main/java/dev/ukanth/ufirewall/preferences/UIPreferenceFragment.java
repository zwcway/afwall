package dev.ukanth.ufirewall.preferences;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import dev.ukanth.ufirewall.R;

public class UIPreferenceFragment extends PreferenceFragment  {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Load the preferences from an XML resource
		addPreferencesFromResource(R.xml.ui_preferences);
	}
}
