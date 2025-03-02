package com.practica.odonto_turno;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter @Setter
public class Pacientes {
    private int id;
    private String nombre;
    private String apellido;
    private LocalDate fecha_nacimiento;


    public Pacientes() {
    }

    public Pacientes(int id, String nombre, String apellido, LocalDate fecha_nacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
    }


    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fechaNacimiento) {
        this.fecha_nacimiento = fechaNacimiento;
    }
}
