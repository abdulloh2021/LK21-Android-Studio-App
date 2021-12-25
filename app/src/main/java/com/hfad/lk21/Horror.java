package com.hfad.lk21;

public class Horror {
    private String name;
    private int imageResourceId;
    public static final Horror[] horrors = {
            new Horror("Dreadout", R.drawable.dreadout),
            new Horror("Kakak", R.drawable.kakak),
            new Horror("Ratu Ilmu Hitam", R.drawable.ratuilmuhitam),
            new Horror("The Exorcist", R.drawable.theexorcist),
            new Horror("Tabu", R.drawable.tabu)


    };
    private Horror(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
}
