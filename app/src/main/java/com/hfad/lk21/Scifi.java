package com.hfad.lk21;

public class Scifi {
    private String name;
    private int imageResourceId;
    public static final Scifi[] scifis = {
            new Scifi("The Matrix", R.drawable.thematrix),
            new Scifi("Tron", R.drawable.tron),
            new Scifi("Alien", R.drawable.alien),
            new Scifi("Gravity", R.drawable.gravity)
    };
    private Scifi(String name, int imageResourceId) {
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
