package eb.egonb.tabbasbar.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import eb.egonb.tabbasbar.fragments.InfoFragment;
import eb.egonb.tabbasbar.fragments.OrderFragment;
import eb.egonb.tabbasbar.fragments.PrefFragment;

public class TabPagerAdapter extends FragmentPagerAdapter {

    private Fragment[]  fragments = { InfoFragment.newInstance(), OrderFragment.newInstance(), PrefFragment.newInstance()};

    public TabPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "Info";
        }
        if(position == 1){
            return "Orders";
        }
        return "Settings";
    }
}
