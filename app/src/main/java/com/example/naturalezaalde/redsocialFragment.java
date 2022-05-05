package com.example.naturalezaalde;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link redsocialFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class redsocialFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public redsocialFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment redsocialFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static redsocialFragment newInstance(String param1, String param2) {
        redsocialFragment fragment = new redsocialFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    ImageButton facebook, instagram, youtube;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_redsocial, container, false);
        instagram = view.findViewById(R.id.btninst);
        facebook=view.findViewById(R.id.btnface);
        youtube=view.findViewById(R.id.btnyou);

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri instagram = Uri.parse("https://www.instagram.com/medioambientemundial_/");
                Intent intent = new Intent(Intent.ACTION_VIEW,instagram);
                startActivity(intent);
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri youtube = Uri.parse("https://www.youtube.com/watch?v=bR2X6sqsAiY");
                Intent intent = new Intent(Intent.ACTION_VIEW,youtube);
                startActivity(intent);

            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri facebook = Uri.parse("https://www.facebook.com/ambientecusco/");
                Intent intent = new Intent(Intent.ACTION_VIEW,facebook);
                startActivity(intent);

            }
        });

        return  view;
    }

}