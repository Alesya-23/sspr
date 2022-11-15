package com.example.sspr;

public class ProfileNotFoundException extends RuntimeException {

    private final int musicId;

    public ProfileNotFoundException(int musicId) {
        this.musicId = musicId;
    }

    @Override
    public String getMessage() {
        return "Music with id = " + musicId + " not found";
    }
}