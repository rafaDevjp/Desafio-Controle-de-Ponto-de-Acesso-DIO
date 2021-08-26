package com.digital.innovation.ControleDePonto.repository;


import com.digital.innovation.ControleDePonto.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
