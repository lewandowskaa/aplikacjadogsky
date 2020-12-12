package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    //interfejs typu crud pozwala na pozyskiwanie jak i zapisywanie informacji z / do bazy danych tabeli user

    Optional<User> findByEmail(String email);
}
