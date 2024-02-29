package com.kalwaeswar.fragmentproject;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class details extends Fragment {
    Button logout;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public details() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment login_page.
     */
    // TODO: Rename and change types and number of parameters
    public static login_page newInstance(String param1, String param2) {
        login_page fragment = new login_page();
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


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_details, container, false);
        logout=view.findViewById(R.id.logout);
        getParentFragmentManager().setFragmentResultListener("editTextText7", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                String data1=result.getString("df1");
                TextView textview1=view.findViewById(R.id.editTextText7);
                textview1.setText(data1);
            }
        });
        getParentFragmentManager().setFragmentResultListener("editTextText8", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                String data2=result.getString("df2");
                TextView textview2=view.findViewById(R.id.editTextText8);
                textview2.setText(data2);
            }
        });

        getParentFragmentManager().setFragmentResultListener("editTextText9", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                String data3=result.getString("df3");
                TextView textview3=view.findViewById(R.id.editTextText9);
                textview3.setText(data3);
            }
        });

        getParentFragmentManager().setFragmentResultListener("editTextText10", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                String data4=result.getString("df4");
                TextView textview4=view.findViewById(R.id.editTextText10);
                textview4.setText(data4);
            }
        });


        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ((MainActivity)requireActivity()).loadFragment(new BlankFragment());
            }
        });
        return view;
    }
}