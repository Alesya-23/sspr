package com.example.sspr;

import com.example.sspr.domain.Music;

import java.util.List;
import java.util.Optional;

public interface IClientMusicService {
    public void create(Music music);
    public List<Music> readAll();
    public Optional<Music> read(int id);

    public boolean update( Music music, int id);
    public boolean delete(int id);
}
