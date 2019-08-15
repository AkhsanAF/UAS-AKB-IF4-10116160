package com.akhsanaf.uasakb4.model;
/* Tanggal Pengerjaan
 *  13 Agustus 2019
 *
 * Akhsan Andara F
 *  10116160
 *  IF-4
 *  */

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragmentAdapter extends FragmentPagerAdapter implements IFragmentAdapter {
    private List<androidx.fragment.app.Fragment> Fragment = new ArrayList<androidx.fragment.app.Fragment>();
    private List<String> NamePage = new ArrayList<>();

    public FragmentAdapter(FragmentManager manager) { super(manager); }

    @Override
    public void add(Fragment Frag, String Title) {
        Fragment.add(Frag);
        NamePage.add(Title);
    }

    @Override
    public Fragment getItem(int position) {
        return Fragment.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return NamePage.get(position);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
