package gagan.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Gagan on 6/30/2017.
 */

class CategoryFragmentAdapter extends FragmentPagerAdapter {
    private Context fragment_context;

    CategoryFragmentAdapter(Context fc, FragmentManager fragment_manager) {
        //Necessary Constructor
        super(fragment_manager);
        fragment_context = fc;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return fragment_context.getString(R.string.category_architecture);
        } else if (position == 1) {
            return fragment_context.getString(R.string.category_museum);
        } else if (position == 2) {
            return fragment_context.getString(R.string.category_religious);
        } else {
            return fragment_context.getString(R.string.category_shopping);
        }
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ArchitecturalFragment();
            case 1:
                return new MuseumFragment();
            case 2:
                return new ReligiousGotoFragment();
            case 3:
                return new ShoppingAreasFragment();
            default:
                return new ArchitecturalFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
