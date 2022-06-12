/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DECORATOR;

/**
 *
 * @author PXNDX
 */
public class VistaCatalogo {

    public static void main(String[] args) {
        VistaVehiculo vistaVehiculo = new VistaVehiculo();
        ModeloDecorador modeloDecorador = new ModeloDecorador(vistaVehiculo);
        MarcaDecorador marcaDecorador = new MarcaDecorador(modeloDecorador);
        marcaDecorador.visualiza();
    }
}
