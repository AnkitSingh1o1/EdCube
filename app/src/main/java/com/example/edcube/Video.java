package com.example.edcube;

public class Video {

    private final String vTitle;
    private final String vThumbnail;

    public Video(String title, String thumbnail) {
        this.vTitle = title;
        this.vThumbnail = thumbnail;

    }

    public String getTitle() {
        return vTitle;
    }

    public String getThumbnail() {
        return vThumbnail;
    }
}
