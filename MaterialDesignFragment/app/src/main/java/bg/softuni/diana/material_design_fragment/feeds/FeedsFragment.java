package bg.softuni.diana.material_design_fragment.feeds;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bg.softuni.diana.material_design_fragment.R;
import bg.softuni.diana.material_design_fragment.databinding.FragmentFeedsBinding;

public class FeedsFragment extends Fragment {

    FragmentFeedsBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_feeds, container, false);
        setupTabs();
        return binding.getRoot();
    }

    @Override
    public void onResume() {
        super.onResume();
        setupTabs();
    }

    public void setupTabs() {
        FeedsPagerAdapter adapter = new FeedsPagerAdapter(getContext(), getChildFragmentManager());
        binding.viewpager.setAdapter(adapter);
        binding.grTabs.setupWithViewPager(binding.viewpager);
    }
}
