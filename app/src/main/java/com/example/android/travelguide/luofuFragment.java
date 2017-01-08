package com.example.android.travelguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class luofuFragment extends Fragment {


    public luofuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_luofu, container, false);

        Guide guide = new Guide(R.string.luofu, R.drawable.luofu);

        ImageView img = (ImageView) rootView.findViewById(R.id.luofu_img);

        img.setImageResource(guide.getImg_id());

        TextView text = (TextView) rootView.findViewById(R.id.luofu_string);

        text.setText(guide.getString_id());

        return rootView;
    }

}
