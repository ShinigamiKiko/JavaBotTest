package ru.anyone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.anyone.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
