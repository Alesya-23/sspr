package com.example.sspr.controllers;

import com.example.sspr.ClientMusicsService;
import com.example.sspr.domain.Music;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping(value = "/musics")
public class MusicController {
    private final ClientMusicsService musicsService;

    public MusicController(ClientMusicsService musicsService) {
        this.musicsService = musicsService;
    }

    @GetMapping(value = "/{id:\\d+}")
    public Music getProfile(@PathVariable int musicId) {
        return musicsService.getMusic(musicId);
    }
}