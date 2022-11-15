package com.example.sspr.repository;

import com.example.sspr.domain.Music;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class MusicMapper implements RowMapper<Music> {

    @Override
    public Music mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Music(
                rs.getInt("id"),
                rs.getString("name_music"),
                rs.getString("author"),
                rs.getString("style")
        );
    }
}
