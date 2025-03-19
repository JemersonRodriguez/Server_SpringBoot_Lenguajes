package com.Api.Demo.DTO;

public class UserDTO {
    private String nombre, carrera;
    private int edad;

    public UserDTO(String nombre , String carrera , int edad) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
    }

    public String getNombre () {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
