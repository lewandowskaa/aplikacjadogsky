package com.example.demo.repository;

import com.example.demo.model.DogServiceType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogServiceTypeRepository extends CrudRepository<DogServiceType, Integer> {

    //interfejs typu crud pozwala na pozyskiwanie jak i zapisywanie informacji z / do bazy danych tabeli dogServiceType
}
