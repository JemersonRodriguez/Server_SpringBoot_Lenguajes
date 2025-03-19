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

    public Profesor consultar(Profesor profesor) {
        for (int i = 0; i < listaProfesores.size(); i++) {
            if (listaProfesores.get(i).equals(profesor)) {
                return listaProfesores.get(i);
            }
        }
        return null;
    }

    public Profesor actualizar(String cedula , Profesor profesor) {
        for (int i = 0 ; i < listaProfesores.size() ; i++) {
            if(listaProfesores.get(i).getCedula().equals(cedula)) {
                listaProfesores.add(i, profesor);
                return listaProfesores.get(i);
            } 
        }
        return null;
    }

    public void eliminar(Profesor profesor) {
        for (int i = 0; i < listaProfesores.size(); i++) {
            if (listaProfesores.get(i).equals(profesor)) {
                listaProfesores.remove(i);
            }
        }
    }
}
