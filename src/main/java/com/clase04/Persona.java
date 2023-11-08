package com.clase04;

public class Persona
{
    private String DNI;
    private String nombre;
    private int edad;

    public Persona() { }
    public Persona(String DNI, String nombre, int edad)
    {   this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getDNI() { return DNI; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    public void setDNI(String DNI) { this.DNI = DNI; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
    
    
    
    
}
