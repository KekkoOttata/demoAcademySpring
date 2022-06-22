package com.example.demoacademyspring.repository;


import com.example.demoacademyspring.entity.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocenteRepository extends JpaRepository<Docente,Long> {

    public List<Docente> findByNome(String nome);


}
