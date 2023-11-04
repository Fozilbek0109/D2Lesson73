package uz.coder.d2lesson73.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

public class VpAdapter extends FragmentStateAdapter {
    List<Fragment> fragmentList;

    public VpAdapter(@NonNull Fragment fragment, List<Fragment> fragmentList) {
        super(fragment);
        this.fragmentList = fragmentList;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getItemCount() {
        return fragmentList.size();
    }
}
