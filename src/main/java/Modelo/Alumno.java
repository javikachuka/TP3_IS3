/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author kachu
 */
public class Alumno {
    private String legajo ;
    
    private String nombre;
    
    private String apellido;
    
    private int nota;
    
    public Alumno (String legajo,String nombre, String apellido, int nota){
        this.legajo = legajo ;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }

    public String getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNota() {
        return nota;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    @Override
    public String toString(){
        return "LEGAJO: " + this.legajo + " ALUMNO: " + this.apellido  + " NOTA: " + this.nota ;
    }
    
    
}
