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
public class Cuenta {
    private String idCuenta;
    private float saldo;
    ArrayList < Cliente > Titulares;      

    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Cliente> getTitulares() {
        return Titulares;
    }

    public void setTitulares(ArrayList<Cliente> Titulares) {
        this.Titulares = Titulares;
    }

    public Cuenta(String idCuenta, float saldo, ArrayList<Cliente> Titulares) {
        this.idCuenta = idCuenta;
        this.saldo = saldo;
        this.Titulares = Titulares;
    }
    
    
    void RegistrarTitular(Cliente c){
        Titulares.add(c);
        c.RegistrarCuenta(this);
    }
}
