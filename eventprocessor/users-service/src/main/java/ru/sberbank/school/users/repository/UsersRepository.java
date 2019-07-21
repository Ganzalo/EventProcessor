package ru.sberbank.school.users.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.sberbank.school.users.entity.User;

import java.util.Optional;

@Repository
public interface UsersRepository extends CrudRepository<User, Long> {

    Optional<User> findUserByUsername(String username);
}