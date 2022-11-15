package com.example.sspr;

import com.example.sspr.domain.Music;
import com.example.sspr.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


public class ClientMusicsService implements IClientMusicService{

    @Autowired
    private MusicRepository musicRepository;

    public ClientMusicsService(MusicRepository profileRepository) {
        this.musicRepository = profileRepository;
    }


    public Music getMusic(int musicId) {
        return musicRepository.getMusicById(musicId)
                .orElseThrow(() -> new ProfileNotFoundException(musicId));
    }

    @Override
    public void create(Music music) {

    }

    @Override
    public List<Music> readAll() {
       return musicRepository.getMusicList();
    }

    @Override
    public Optional<Music> read(int id) {
        return musicRepository.findOneById(id);
    }

    @Override
    public boolean update(Music music, int id) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
