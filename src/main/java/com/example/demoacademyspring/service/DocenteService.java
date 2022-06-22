package com.example.demoacademyspring.service;

import com.example.demoacademyspring.entity.Docente;

import java.util.List;

public interface DocenteService {
    List<Docente> getAllDocenti();

    void save(Docente docente);
}
