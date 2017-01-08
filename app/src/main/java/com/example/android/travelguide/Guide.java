package com.example.android.travelguide;

/**
 * Created by tom on 2017/1/7.
 */

public class Guide {

    private int string_id;

    private int img_id;

    public Guide(int string_id, int img_id) {
        this.string_id = string_id;
        this.img_id = img_id;
    }

    public int getString_id() {
        return string_id;
    }

    public int getImg_id() {
        return img_id;
    }
}
