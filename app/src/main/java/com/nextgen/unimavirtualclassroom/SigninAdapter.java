package com.nextgen.unimavirtualclassroom;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SigninAdapter extends FragmentPagerAdapter {

    private Context mContext;
    int totalTabs;

    public SigninAdapter(FragmentManager fm, Context mContext, int totalTabs) {
      super(fm);
      this.mContext = mContext;
      this.totalTabs = totalTabs;

    }

    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                SigninTabFragment signinTabFragment = new SigninTabFragment();
                return signinTabFragment;
            case 1:
                SignupTabFragment signupTabFragment = new SignupTabFragment();
                return signupTabFragment;
            default:
                return null;
        }
    }
        }

    @Override
    public int getCount() {
        return 0;
    }
}
