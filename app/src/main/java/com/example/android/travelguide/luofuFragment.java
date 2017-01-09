package com.example.android.travelguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class LuofuFragment extends Fragment {


    public LuofuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_luofu, container, false);

        ArrayList<Guide> guides = new ArrayList<Guide>();

        guides.add(new Guide(R.string.no_string, R.drawable.luofu));
        guides.add(new Guide(R.string.luofu_position, 0));
        guides.add(new Guide(R.string.luofu_area, 0));
        guides.add(new Guide(R.string.luofu_intro, 0));
        guides.add(new Guide(R.string.luofu_history, 0));

        GuideArrayAdapter adapter = new GuideArrayAdapter(getContext(), guides);

        ListView listview = (ListView) rootView.findViewById(R.id.list_luofu);

        listview.setAdapter(adapter);

        return rootView;
    }

}
