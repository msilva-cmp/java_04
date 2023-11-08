package com.clase04;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Clase04
{
    public static void main(String[] args)
    {
        //Transformar hexa a UNICODE:
        /*
        int[] codIcon = {0xD83D, 0xDD25};
        String icon = new String(codIcon, 0, codIcon.length);
        JOptionPane.showMessageDialog(null, icon,"Mensaje de unicode", JOptionPane.DEFAULT_OPTION);
        */
        //
        
        List<Cliente> listaCli = new ArrayList();
        
        Cliente cli1 = new Cliente(1, "123456", "Juan Perez", 19);
        Cliente cli2 = new Cliente(2, "234567", "María Perez", 17);
        Cliente cli3 = new Cliente(3, "345678", "Pablo Perez", 18);
        Cliente cli4 = new Cliente(4, "456789", "Sofía Perez", 55);
        
        listaCli.add(cli1);
        listaCli.add(cli2);
        listaCli.add(cli3);
        listaCli.add(cli4);
        
        //Mostrar mayoría de edad con expresión lambda:
        listaCli.stream()
                .forEach(cli -> System.out.println(cli.getNombre() + " es mayor de edad?: " + (cli.getEdad() >=18)));
        
        //Mostrar mayoría de edad con InterfazCliente:
        for(Cliente cli: listaCli)
            System.out.println(cli.mayorDeEdad());
        
        //Mostrar datos de clientes con InterfazCliente:
        for(Cliente cli: listaCli)
            cli.mostrarInfo();
    }
}
