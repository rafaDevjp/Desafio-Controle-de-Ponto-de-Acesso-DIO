package com.digital.innovation.ControleDePonto.service;


import com.digital.innovation.ControleDePonto.DTO.response.ResponseMessageDTO;
import com.digital.innovation.ControleDePonto.model.JornadaTrabalho;
import com.digital.innovation.ControleDePonto.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {


    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }


    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return  jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();
    }


    public Optional<JornadaTrabalho> getById(Long id) {
        return jornadaRepository.findById(id);
    }

     public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return  jornadaRepository.save(jornadaTrabalho);
    }

     public void deleteJornada(Long id) {
        jornadaRepository.deleteById(id);
    }
}
