package bg.softuni.diana.material_design_fragment.feeds;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import bg.softuni.diana.material_design_fragment.R;

public class FeedsPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public FeedsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new StoriesFragment();
            case 1:
                return new CampainsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return context.getString(R.string.stories);
            case 1:
                return context.getString(R.string.campaigns);
            default:
                return null;
        }
    }

}

