/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipn.mx.asociacion;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Cliente {
    private String nombre;
    private int numero;
    private String direccion;
    ArrayList  <Cuenta> Cuentas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Cuenta> getCuentas() {
        return Cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> Cuentas) {
        this.Cuentas = Cuentas;
    }

    public Cliente(String nombre, int numero, String direccion, ArrayList<Cuenta> Cuentas) {
        this.nombre = nombre;
        this.numero = numero;
        this.direccion = direccion;
        this.Cuentas = Cuentas;
    }
    
    
    void RegistrarCuenta(Cuenta e){
        Cuentas.add(e);
    }
    
}
