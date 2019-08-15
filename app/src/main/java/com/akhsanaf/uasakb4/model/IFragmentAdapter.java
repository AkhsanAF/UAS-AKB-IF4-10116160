package com.akhsanaf.uasakb4.model;
/* Tanggal Pengerjaan
 *  13 Agustus 2019
 *
 * Akhsan Andara F
 *  10116160
 *  IF-4
 *  */

import androidx.fragment.app.Fragment;

public interface IFragmentAdapter {
    void add(Fragment Frag, String Title);
    Fragment getItem(int position);
    CharSequence getPageTitle(int position);
    int getCount();
}
