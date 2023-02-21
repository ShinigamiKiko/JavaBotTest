package ru.anyone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.anyone.model.Film;
@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
}
