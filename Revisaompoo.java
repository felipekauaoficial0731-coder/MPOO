/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.revisaompoo;

import java.util.Scanner;

/**
 * @author 20251303.MTC0046
 */
public class Revisaompoo {

    public static void main(String[] args) {
        System.out.println("----Bem vindo----");
        Scanner s1 = new Scanner(System.in); 
        Scanner s2 = new Scanner(System.in); 
        
        System.out.println("=====Digite o Código de identificação do Drone=====");
        String id = s1.nextLine();
        System.out.println("=====Digite o tempo de autonomia do Drone=====");
        int aut = s1.nextInt();
        
        System.out.println("=====digite a potencia do motor e a marca dele (nessa ordem)=====");
        int potencia = s1.nextInt();
        String marca = s1.next(); 
        
        Drone d1 = new Drone(id, aut, potencia, marca);
        
        System.out.println("=====Digite o código de identificação da carga=====");
        String idc = s2.nextLine();
        
        System.out.println("=====Digite o peso da carga em Kg=====");
        double peso = s2.nextDouble();
        
        Carga c1 = new Carga(idc,peso);
        
        d1.acoplarCarga(c1);
        d1.exibirStatus();
        
        
    }
}
