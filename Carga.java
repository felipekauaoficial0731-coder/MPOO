/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisaompoo;

/**
 *
 * @author 20251303.MTC0046
 */
public class Carga {
    private String codigoRastreio;
    private double pesoKg;

    public Carga(String codigoRastreio, double pesoKg) {
        this.codigoRastreio = codigoRastreio;
        this.pesoKg = pesoKg;
    }

    public Carga(String codigoRastreio) {
        this.codigoRastreio = codigoRastreio;
        this.pesoKg = 0;
    }

    public String getCodigoRastreio() {
        return codigoRastreio;
    }

    public double getPesoKg() {
        return pesoKg;
    }
    
    
}
