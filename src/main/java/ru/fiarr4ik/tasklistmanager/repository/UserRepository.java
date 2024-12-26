package ru.fiarr4ik.tasklistmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.fiarr4ik.tasklistmanager.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);

}
