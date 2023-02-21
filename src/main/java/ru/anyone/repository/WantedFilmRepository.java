package ru.anyone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.anyone.model.WantedFilm;
@Repository
public interface WantedFilmRepository extends JpaRepository<WantedFilm, Long> {
}
