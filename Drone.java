/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisaompoo;

/**
 *
 * @author 20251303.MTC0046
 */

public class Drone {
    private String codId;
    private int autMin;
    private Motor motor;
    private Carga carga;

    // Ajustado para receber a potência e a marca diretamente
    public Drone(String codId, int autMin, int potenciaMotor, String marcaMotor) {
        this.codId = codId;
        this.autMin = autMin;
        // Composição: criamos o Motor passando as variáveis (sem colocar o tipo "int" ou "String" aqui dentro)
        this.motor = new Motor(potenciaMotor, marcaMotor);
    }
    
    public void acoplarCarga(Carga c){
        this.carga = c; 
    }
    
    public void exibirStatus (){
        System.out.println("=== Status do Drone ===");
        System.out.println("ID do Drone: " + this.codId);
        System.out.println("Autonomia: " + this.autMin);
        System.out.println("Motor: "+ this.motor.getMarca() + " (" + this.motor.getPotenciaRPM() + " RPM)");
        
        // Evita erro de NullPointerException caso o drone ainda não tenha carga acoplada
        if (this.carga != null) {
            System.out.println("Carga: "+ this.carga.getCodigoRastreio() + " (" + this.carga.getPesoKg() + "Kg)");
        } else {
            System.out.println("Carga: Nenhuma carga acoplada.");
        }
    }
}