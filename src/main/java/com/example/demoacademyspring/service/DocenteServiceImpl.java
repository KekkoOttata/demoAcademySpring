package com.example.demoacademyspring.service;


import com.example.demoacademyspring.entity.Docente;
import com.example.demoacademyspring.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteServiceImpl implements DocenteService {


    @Autowired
    DocenteRepository docenteRepository;

    @Override
    public List<Docente> getAllDocenti() {
        return docenteRepository.findAll();
    }

    @Override
    public void save(Docente docente) {
        docenteRepository.save(docente);
        System.out.println("Il docente è stato salvato correttamente");
    }
}
