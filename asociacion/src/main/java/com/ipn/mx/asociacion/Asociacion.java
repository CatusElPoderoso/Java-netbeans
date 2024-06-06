/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ipn.mx.asociacion;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Asociacion {

    public static void main(String[] args) {
        
        //-- 1. creamos los arraylist que contienen la lista de cuentas y clientes
        ArrayList<Cliente> Clientes = new ArrayList<Cliente>();
        ArrayList<Cuenta> Cuentas = new ArrayList<Cuenta>();
        
        //-- 2. creamos a los clientes, les damos valores y las agregamos al arraylist
        Cliente c1 = new Cliente("Lorea",123,"col. caca",Cuentas);
            Clientes.add(c1);
        Cliente c2 = new Cliente("Maribel",123,"col. caca",Cuentas);
            Clientes.add(c2);
        Cliente c3 = new Cliente("Mario",123,"col. caca",Cuentas);
            Clientes.add(c3);
            
        //-- 3. creamos tres cuentass y las agregamos al arraylist}
        Cuenta u1 = new Cuenta("0A1",14,Clientes);
            Cuentas.add(u1);
        Cuenta u2 = new Cuenta("0A2",2,Clientes);
            Cuentas.add(u2);
        Cuenta u3 = new Cuenta("0A3",84,Clientes);
            Cuentas.add(u3);
            
        //-- 4. asignamos a c1 & c3 como titulares de u1
        u1.RegistrarTitular(c1);
        u1.RegistrarTitular(c3);
        
        //-- 5. asignamos a c1 & c2 como titulares de u2
        u2.RegistrarTitular(c1);
        u2.RegistrarTitular(c2);
        
        //-- 6. asignamos a c2 como titular de u3
        u3.RegistrarTitular(c2);
        
       
        //-- MENU PRINCIPAL DEL SISTEMA
        
        //-- 1. mostrar todos los clientes para elegir alguno
        System.out.println(Clientes.get(0).getNombre());
        System.out.println(Clientes.get(1).getNombre());
        System.out.println(Clientes.get(2).getNombre());
        
        boolean loop = true;
        
        while(loop){
            
        //- - - > mostrar la informacion de todas las cuentas en forma de lista de las cuales es Titular
        String[] options = { "Lorea", "Maribel", "Mario" ,"Salir"};
        var selection = JOptionPane.showOptionDialog(null, "Escoje una cuenta: ", "", 
                                                      0, 3, null, options, options[0]);
        if (selection == 0) {
          JOptionPane.showMessageDialog(null, options[selection] + " es titular de las cuentas: \nID: " + u1.getIdCuenta() + "\nSaldo: " + u1.getSaldo() + "\nID: " 
                  + u2.getIdCuenta() + "\nSaldo: " + u2.getSaldo());
        }
        if (selection == 1) { 
          JOptionPane.showMessageDialog(null, options[selection] + " es titular de las cuentas: \nID: " + u2.getIdCuenta() + "\nSaldo: " + u2.getSaldo() + "\nID: " 
                  + u3.getIdCuenta() + "\nSaldo: " + u3.getSaldo());
        }
        if (selection == 2) { 
          JOptionPane.showMessageDialog(null, options[selection] + " es titular de las cuentas: \nID: " + u1.getIdCuenta() + "\nSaldo: " + u1.getSaldo());
        }
        if (selection == 3) { 
          JOptionPane.showMessageDialog(null, "Adioshjeejeje");
          loop=false;
        }
        }
        
        
        
    }
}
