package com.Api.Demo.Service;

import java.util.ArrayList;

import com.Api.Demo.Model.Profesor;

public class ProfesorService {
    private ArrayList<Profesor> listaProfesores;

    public ProfesorService() {
        this.listaProfesores = new ArrayList<Profesor>();
    }

    public ArrayList<Profesor> listar() {
        return listaProfesores;
    }

    public boolean agregar(Profesor profesor) {
        listaProfesores.add(profesor);
        return true;
    }

    public String consultar(Profesor profesor) {
        for (int i = 0; i < listaProfesores.size(); i++) {
            if (listaProfesores.get(i).equals(profesor)) {
                return listaProfesores.get(i).toString();
            }
        }
        return null;
    }

    public boolean actualizar(Profesor profesor) {
        for (int i = 0 ; i < listaProfesores.size() ; i++) {
            if(listaProfesores.get(i).equals(profesor)) {
                listaProfesores.add(i, profesor);
                return true;
            } 
        }
        return false;
    }

    public boolean eliminar(Profesor profesor) {
        for (int i = 0; i < listaProfesores.size(); i++) {
            if (listaProfesores.get(i).equals(profesor)) {
                listaProfesores.remove(i);
                return true;
            }
        }
        return false;
    }
}
