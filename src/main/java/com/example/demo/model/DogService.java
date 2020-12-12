package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class DogService {

    // Klasa model / szablon psiej uslugi dla wskazanego psa wraz z cena i czasem wykonania

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private double price;
    private LocalTime time;

    @ManyToOne(fetch = FetchType.LAZY)
    private Dog dog;

    @ManyToOne(fetch = FetchType.LAZY)
    private DogServiceType dogServiceType;

    @ManyToMany(mappedBy = "dogServiceList", fetch = FetchType.LAZY)
    private List<Visit> visitList;
}
