package com.hfad.lk21;

public class Adventure {
    private String name;
    private int imageResourceId;
    public static final Adventure[] adventures = {
            new Adventure("Jumanji", R.drawable.jumanji),
            new Adventure("Jungle Cruise", R.drawable.junglecruise)
    };
    private Adventure(String name, int imageResourceId) {
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
