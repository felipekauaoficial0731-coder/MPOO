/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisaompoo;

/**
 *
 * @author 20251303.MTC0046
 */
public class Motor {
    private int potenciaRPM;
    private String marca;

    public Motor() {
        this.potenciaRPM = 500;
        this.marca = "SunnySky";
    }
     
    
    public Motor(int potenciaRPM, String marca) {
        this.potenciaRPM = potenciaRPM;
        this.marca = marca;
    }

    public int getPotenciaRPM() {
        return potenciaRPM;
    }

    public String getMarca() {
        return marca;
    }
    
    
}
