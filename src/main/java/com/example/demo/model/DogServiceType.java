package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class DogServiceType {

    // Klasa model / szablon rodzaj psiej uslugi


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String type;

    @OneToMany(mappedBy = "dogServiceType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<DogService> dogServiceList;
}
