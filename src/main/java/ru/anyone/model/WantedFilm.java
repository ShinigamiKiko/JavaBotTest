package ru.anyone.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class WantedFilm {
    private final long id;
    private final long filmId;
    private final long userId;
    private boolean isWatched;
    private final LocalDateTime createdAt;
    private LocalDateTime uptatedAt;

    public WantedFilm(long id,
                      long filmId,
                      long userId,
                      boolean isWatched,
                      LocalDateTime createdAt,
                      LocalDateTime uptatedAt) {
        this.id = id;
        this.filmId = filmId;
        this.userId = userId;
        this.isWatched = isWatched;
        this.createdAt = createdAt;
        this.uptatedAt = uptatedAt;
    }
}
