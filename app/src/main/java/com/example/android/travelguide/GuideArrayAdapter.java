package com.example.android.travelguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tom on 2017/1/9.
 */

public class GuideArrayAdapter extends ArrayAdapter<Guide> {

    public GuideArrayAdapter(Context context, List<Guide> guides) {
        super(context, 0, guides);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Guide currentGuide = getItem(position);

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView img = (ImageView) listItemView.findViewById(R.id.list_item_img);
        TextView text = (TextView) listItemView.findViewById(R.id.list_item_text);

        text.setText(currentGuide.getString_id());

        if (currentGuide.hasImage()) {
            img.setImageResource(currentGuide.getImg_id());
        }

        return listItemView;
    }
}
