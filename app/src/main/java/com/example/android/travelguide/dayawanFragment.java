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
public class dayawanFragment extends Fragment {


    public dayawanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_dayawan, container, false);

        Guide guide = new Guide(R.string.dayawan, R.drawable.dayawan);

        ImageView img = (ImageView) rootView.findViewById(R.id.dayawan_img);

        img.setImageResource(guide.getImg_id());

        TextView text = (TextView) rootView.findViewById(R.id.dayawan_string);

        text.setText(guide.getString_id());

        return rootView;
    }

}
