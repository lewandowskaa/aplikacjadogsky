package com.example.demo.repository;

import com.example.demo.model.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogRepository extends CrudRepository<Dog, Integer> {

    //interfejs typu crud pozwala na pozyskiwanie informacji z bazy danych z tabeli dog

    List<Dog> findAll();
}
