package com.hfad.lk21;

public class Top {
    private String name;
    private int imageResourceId;
    public static final Top[]  tops = {
            new Top("Jumanji", R.drawable.jumanji),
            new Top("Jungle Cruise", R.drawable.junglecruise),
            new Top("Dreadout", R.drawable.dreadout),
            new Top("Kakak", R.drawable.kakak),
            new Top("Ratu Ilmu Hitam", R.drawable.ratuilmuhitam),
            new Top("The Exorcist", R.drawable.theexorcist),
            new Top("Tabu", R.drawable.tabu),
            new Top("The Matrix", R.drawable.thematrix),
            new Top("Tron", R.drawable.tron),
            new Top("Alien", R.drawable.alien),
            new Top("Gravity", R.drawable.gravity)
    };
    private Top(String name, int imageResourceId) {
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
