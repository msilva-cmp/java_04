package com.clase04;

public class Cliente extends Persona implements InterfaceCliente
{
    private int codCliente;

    public Cliente() { }
    public Cliente(int codCliente, String DNI, String nombre, int edad)
    {   super(DNI, nombre, edad);
        this.codCliente = codCliente;
    }

    public int getCodCliente() { return codCliente; }
    public void setCodCliente(int codCliente) { this.codCliente = codCliente; }

    
    @Override
    public boolean mayorDeEdad()
    {   return  getEdad()>=18;  }
    

    @Override
    public void mostrarInfo()
    {
        System.out.println("Información del cliente:");
        System.out.println("DNI: " + getDNI());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Código: " + codCliente);
    }

    @Override
    public String toString() {
        return "Cód. Cliente : " + codCliente;
    }
    
    
}
