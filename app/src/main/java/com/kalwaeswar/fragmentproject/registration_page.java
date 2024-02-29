package com.kalwaeswar.fragmentproject;

import android.annotation.SuppressLint;

import android.app.DatePickerDialog;
import android.os.Bundle;
import java.util.Calendar;
import androidx.fragment.app.Fragment;
import android.widget.DatePicker;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link registration_page#newInstance} factory method to
 * create an instance of this fragment.
 */
public class registration_page extends Fragment {
    Button register;
    EditText dob;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public registration_page() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static registration_page newInstance(String param1, String param2) {
        registration_page fragment = new registration_page();
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

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_registration_page, container, false);

        register=view.findViewById(R.id.register);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edittext1 = view.findViewById(R.id.editTextText);
                EditText edittext2 = view.findViewById(R.id.editTextText2);
                EditText edittext3 = view.findViewById(R.id.editTextText4);
                EditText edittext4 = view.findViewById(R.id.editTextText3);
                Bundle result1 = new Bundle();
                result1.putString("df1", edittext1.getText().toString());
                getParentFragmentManager().setFragmentResult("editTextText7", result1);
                edittext1.setText("");

                Bundle result2 = new Bundle();
                result2.putString("df2", edittext2.getText().toString());
                getParentFragmentManager().setFragmentResult("editTextText8", result2);
                edittext2.setText("");

                Bundle result3 = new Bundle();
                result3.putString("df3", edittext3.getText().toString());
                getParentFragmentManager().setFragmentResult("editTextText9", result3);
                edittext3.setText("");

                Bundle result4 = new Bundle();
                result3.putString("df4", edittext4.getText().toString());
                getParentFragmentManager().setFragmentResult("editTextText10", result3);
                edittext4.setText("");
                ((MainActivity) requireActivity()).loadFragment(new details());

            }

        });
        return view;
    }



}
