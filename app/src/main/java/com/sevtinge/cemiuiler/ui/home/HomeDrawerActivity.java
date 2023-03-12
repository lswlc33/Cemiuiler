package com.sevtinge.cemiuiler.ui.home;

import androidx.fragment.app.Fragment;
import com.sevtinge.cemiuiler.R;
import com.sevtinge.cemiuiler.ui.base.BaseAppCompatActivity;
import com.sevtinge.cemiuiler.ui.base.SubFragment;
import moralnorm.os.SdkVersion;
import moralnorm.preference.SwitchPreference;

public class HomeDrawerActivity extends BaseAppCompatActivity {

        @Override
        public Fragment initFragment() {
            return new com.sevtinge.cemiuiler.ui.home.HomeDrawerActivity.HomeDrawerFragment();
        }

        public static class HomeDrawerFragment extends SubFragment {

            SwitchPreference mAllAppsContainerViewBlur;

            @Override
            public int getContentResId() {
                return R.xml.home_drawer;
            }

            @Override
            public void initPrefs() {
                mAllAppsContainerViewBlur = findPreference("prefs_key_home_drawer_blur");
                mAllAppsContainerViewBlur.setVisible(SdkVersion.isAndroidT||SdkVersion.isAndroidS);

                mAllAppsContainerViewBlur.setOnPreferenceChangeListener((preference, o) -> {
                    return true;
                });

            }
        }


    }
