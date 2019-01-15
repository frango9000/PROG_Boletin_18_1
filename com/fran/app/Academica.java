/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fran.app;

import com.fran.data.*;

/**
 *
 * @author fsancheztemprano
 */
public class Academica {
    private static int numReferencia =2018;
    
    private int matricula;
    private String nombre;
    private int nota;
    private Personal personal;

    public Academica(String nombre, int nota, Personal personal) {
        this.nombre = nombre;
        this.nota = nota;
        this.personal = personal;
        this.matricula = numReferencia;
        numReferencia++;
    }

    public static int getNumReferencia() {
        return numReferencia;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    public Personal getPersonal() {
        return personal;
    }

    @Override
    public String toString() {
        return "Academica{" + "matricula=" + matricula + ", nombre=" + nombre + ", nota=" + nota + ", personal=" + personal + '}';
    }
    
    
}
