package com.Api.Demo.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.Api.Demo.Model.Profesor;

@Service
public class ProfesorService {
    private ArrayList<Profesor> listaProfesores;

    public ProfesorService() {
        this.listaProfesores = new ArrayList<Profesor>();
    }

    public ArrayList<Profesor> listar() {
        return listaProfesores;
    }

    public Profesor agregar(Profesor profesor) {
        listaProfesores.add(profesor);
        return profesor;
    }

    public Profesor consultar(String cedula) {
        for (int i = 0; i < listaProfesores.size(); i++) {
            if (listaProfesores.get(i).getCedula().equals(cedula)) {
                return listaProfesores.get(i);
            }
        }
        return null;
    }

    public Profesor actualizar(String cedula , Profesor profesor) {
        profesor.setCedula(cedula); //Para añadir la prop enviada en la Request y poder unrila al objeto
        for (int i = 0 ; i < listaProfesores.size() ; i++) {
            if(listaProfesores.get(i).getCedula().equals(cedula)) {
                listaProfesores.set(i, profesor);
                return listaProfesores.get(i);
            } 
        }
        return null;
    }

    public void eliminar(String cedula) {
        for (int i = 0; i < listaProfesores.size(); i++) {
            if (listaProfesores.get(i).getCedula().equals(cedula)) {
                listaProfesores.remove(i);
            }
        }
    }
}
