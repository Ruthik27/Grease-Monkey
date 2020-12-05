package com.example.firebase01;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


public class infofragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    String title, aa , ab, ac;

    public infofragment() {

    }

    public infofragment(String title, String aa, String ab, String ac) {
        this.title=title;
        this.aa = aa;
        this.ab = ab;
        this.ac = ac;

    }



    public static infofragment newInstance(String param1, String param2) {
        infofragment fragment = new infofragment();
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

        View view = inflater.inflate(R.layout.fragment_infofragment, container, false);
        TextView titleholder=view.findViewById(R.id.titleholder);
        TextView aaholder = view.findViewById(R.id.aaholder);
        TextView abholder = view.findViewById(R.id.abholder);
        TextView acholder = view.findViewById(R.id.acholder);

        titleholder.setText(title);
        aaholder.setText(aa);
        abholder.setText(ab);
        acholder.setText(ac);

        return view;
    }
    public void onBackPressed(){

        AppCompatActivity activity = (AppCompatActivity)getContext();
        activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new dscfragment()).addToBackStack(null).commit();


    }

}