package com.akhsanaf.uasakb4.presenter.fragment;
/* Tanggal Pengerjaan
 *  12 Agustus 2019
 *
 * Akhsan Andara F
 *  10116160
 *  IF-4
 *  */

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.akhsanaf.uasakb4.R;


public class FragmentKontak extends Fragment {

    TextView textViewInstagram,textViewLine,textViewGithub,textViewFacebook,textViewGmail;

    public FragmentKontak() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragement_kontak = inflater.inflate(R.layout.fragment_kontak, container, false);
        textViewInstagram = fragement_kontak.findViewById(R.id.instagram);
        textViewLine = fragement_kontak.findViewById(R.id.line);
        textViewGithub = fragement_kontak.findViewById(R.id.github);
        textViewGmail = fragement_kontak.findViewById(R.id.gmail);
        textViewFacebook = fragement_kontak.findViewById(R.id.facebook);

        textViewInstagram.setMovementMethod(LinkMovementMethod.getInstance());
        textViewLine.setMovementMethod(LinkMovementMethod.getInstance());
        textViewGithub.setMovementMethod(LinkMovementMethod.getInstance());
        textViewGmail.setMovementMethod(LinkMovementMethod.getInstance());
        textViewFacebook.setMovementMethod(LinkMovementMethod.getInstance());

        return fragement_kontak;
    }

}
