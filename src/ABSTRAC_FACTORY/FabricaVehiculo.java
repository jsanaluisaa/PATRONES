/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABSTRAC_FACTORY;

/**
 *
 * @author PXNDX
 */
public interface FabricaVehiculo {

    Automovil creaAutomovil(String modelo, String color,
            int potencia, double espacio);

    Scooter creaScooter(String modelo, String color, int potencia);
}
