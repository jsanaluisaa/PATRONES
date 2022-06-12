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
public class MarcaDecorador extends Decorador {

    public MarcaDecorador(ComponenteGraficoVehiculo componente) {
        super(componente);
    }

    protected void visualizaLogo() {
        System.out.println("Logotipo de la marca");
    }

    public void visualiza() {
        super.visualiza();
        this.visualizaLogo();
    }
}
