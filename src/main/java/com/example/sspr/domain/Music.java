package com.example.sspr.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "musics")
public class Music {
/**
 * Класс, описывающий music.
 *
 * @author AlesyaDem
 * @since 1.0.0
 */

    /**
     * Идентификатор
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Название
     */
    @Column(name = "name_music")
    private String nameMusic;

    /**
     * Автор
     */
    @Column(name = "author")
    private String author;

    /**
     * Жанр
     */
    @Column(name = "style")
    private String style;

    public Integer getId() {
        return id;
    }

    public Music(int id, String nameMusic, String author, String style){

    }
}