package com.digital.innovation.ControleDePonto.controller;

import com.digital.innovation.ControleDePonto.model.JornadaTrabalho;
import com.digital.innovation.ControleDePonto.service.JornadaService;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class JornadaTrabalhoController {
    @Autowired
    JornadaService jornadaService;


     @PostMapping("/registro")
     public JornadaTrabalho  createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
         return jornadaService.saveJornada(jornadaTrabalho);
    }

     @GetMapping("/jornada")
     public List<JornadaTrabalho> getJornadaList(){

         return jornadaService.findAll();
    }

     @GetMapping("/jornada/{id}")
     public ResponseEntity<JornadaTrabalho>  getJornadaID(@PathVariable("id") Long id) throws Exception {
         return ResponseEntity.ok(jornadaService.getById(id).orElseThrow(() -> new Exception("Elelemnto não encontrado")));
    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping("/jornada/{id}")
     public ResponseEntity<Optional<JornadaTrabalho>>  deleteByID(@PathVariable("id") Long id){

         try {
             jornadaService.deleteJornada(id);
             return new ResponseEntity<Optional<JornadaTrabalho>>(HttpStatus.OK);
         }catch (NoSuchElementException e){
             System.out.println(e.getMessage());
             return new ResponseEntity<Optional<JornadaTrabalho>>(HttpStatus.NOT_FOUND);
         }


    }
}
