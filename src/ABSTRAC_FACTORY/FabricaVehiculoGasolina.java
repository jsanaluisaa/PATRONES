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
public class FabricaVehiculoGasolina implements FabricaVehiculo {

    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilGasolina(modelo, color,
                potencia, espacio);
    }

    public Scooter creaScooter(String modelo, String color, int potencia) {
        return new ScooterGasolina(modelo, color, potencia);
    }
}
