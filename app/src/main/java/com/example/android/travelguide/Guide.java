package com.example.android.travelguide;

/**
 * Created by tom on 2017/1/7.
 */

public class Guide {

    private final int no_image_provided = -1;

    private int string_id;

    private int img_id = no_image_provided;

    public Guide(int string_id) {
        this.string_id = string_id;
    }

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

    public boolean hasImage() {
        return img_id != no_image_provided;
    }

}
