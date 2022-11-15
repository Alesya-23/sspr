package com.example.sspr.repository;

import com.example.sspr.domain.Music;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@AllArgsConstructor
public class MusicRepository {
    @Getter
    private List<Music> musicList;

    private static final String SQL_GET_PROFILE_BY_ID =
            "select id, name_music, author, style from musics where id = :id";
    @Getter
    private final MusicMapper musicMapper;
    private final NamedParameterJdbcTemplate jdbcTemplate;

    public MusicRepository(
            MusicMapper musicMapper,
            NamedParameterJdbcTemplate jdbcTemplate
    ) {
        this.musicMapper = musicMapper;
        this.jdbcTemplate = jdbcTemplate;
    }

    public Optional<Music> getMusicById(int id) {
        var params = new MapSqlParameterSource();
        params.addValue("id", id);
        return jdbcTemplate.query(
                        SQL_GET_PROFILE_BY_ID,
                        params,
                        musicMapper
                ).stream()
                .findFirst();
    }

    public List<Music> getMusicList() {
        return this.musicList;
    }

    public Optional<Music> findOneById(int id) {
        return this.musicList.stream()
                .filter(product -> Objects.equals(id, product.getId()))
                .findFirst();
    }
}
