package com.Api.Demo.Service;

import java.util.ArrayList;

import com.Api.Demo.Model.Profesor;

public class ProfesorService {
    private ArrayList<Profesor> listaProfesores;

    public ProfesorService () {
        this.listaProfesores = new ArrayList<Profesor>();
    }

    public ArrayList<Profesor> getListaProfesores () {
        return listaProfesores;
    }

    public void agregar () {}
    public void listar () {}
    public void consultar () {}
    public void actualizar () {}
    public void eliminar () {}
}
