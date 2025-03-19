package com.Api.Demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Api.Demo.Model.Profesor;
//import org.springframework.web.bind.annotation.RequestParam;
//import com.Api.Demo.DTO.UserDTO;
import com.Api.Demo.Service.ProfesorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/profesores")
public class ProfesorController {

    private final ProfesorService profesorService;

    public ProfesorController (ProfesorService profesorService) {
        this.profesorService = profesorService;
    }
    @GetMapping("/")
    public ArrayList<Profesor> listar() {
        return profesorService.listar();
    }

    @PostMapping("/")
    public Profesor insertar (@RequestBody Profesor profesor) {
       return profesorService.agregar(profesor);
    }

    @PutMapping("/{cedula}") 
    public Profesor actualizar(@PathVariable String cedula , @RequestBody Profesor profesor) {
        return profesorService.actualizar(cedula , profesor);
    }

    @DeleteMapping("/{cedula}")
    public void eliminar(@PathVariable String cedula) {
        profesorService.eliminar(cedula);
    }

    //Endpoint Query Params osea un Param Opcional
    
    
}
