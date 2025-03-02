package com.practica.odonto_turno.controller;


import com.practica.odonto_turno.Pacientes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@RestController
public class OdontoController {
@GetMapping("/pacientes")
    public List traerPacientes(){

        List<Pacientes> listaPacientes = new ArrayList<Pacientes>();

        listaPacientes.add(new Pacientes(1,"Jose","Hernandez",LocalDate.of(1990,5,24)));
        listaPacientes.add(new Pacientes(1,"Ariel","Perez",LocalDate.of(1993,3,14)));
        listaPacientes.add(new Pacientes(1,"Luis","Dominguez",LocalDate.of(2018,6,13)));
        listaPacientes.add(new Pacientes(1,"Miguel","Gimenez",LocalDate.of(2001,8,1)));
        listaPacientes.add(new Pacientes(1,"Dario","Diaz",LocalDate.of(2000,10,22)));
        listaPacientes.add(new Pacientes(1,"Diego","Torres",LocalDate.of(2020,12,31)));

        return listaPacientes;

}

    @GetMapping("/pacientes/menores")
    @ResponseBody

    public List<Pacientes> traerMenores(){

        List<Pacientes> listaPacientes = new ArrayList<Pacientes>();

        listaPacientes.add(new Pacientes(1,"Jose","Hernandez",LocalDate.of(1990,5,24)));
        listaPacientes.add(new Pacientes(2,"Ariel","Perez",LocalDate.of(1993,3,14)));
        listaPacientes.add(new Pacientes(3,"Luis","Dominguez",LocalDate.of(2018,6,13)));
        listaPacientes.add(new Pacientes(4,"Miguel","Gimenez",LocalDate.of(2001,8,1)));
        listaPacientes.add(new Pacientes(5,"Dario","Diaz",LocalDate.of(2000,10,22)));
        listaPacientes.add(new Pacientes(6,"Diego","Torres",LocalDate.of(2020,12,31)));

            List<Pacientes> listaMenores = new ArrayList<Pacientes>();

            for (Pacientes paci : listaPacientes){

                LocalDate fechaActual = LocalDate.now();

                Period diferenciaAnios = Period.between(paci.getFecha_nacimiento(), fechaActual);

                if(diferenciaAnios.getYears()< 18){
                    System.out.println("Edad: "+ diferenciaAnios.getYears());
                    listaMenores.add(paci);
                }

            }
            return listaMenores;

    }
}
