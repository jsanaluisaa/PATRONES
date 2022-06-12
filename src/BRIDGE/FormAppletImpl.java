/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BRIDGE;

/**
 *
 * @author PXNDX
 */
import java.util.Scanner;

public class FormAppletImpl implements FormularioImpl {

    Scanner reader = new Scanner(System.in);

    public void dibujaTexto(String texto) {
        System.out.println("Applet: " + texto);
    }

    public String administraZonaIndicada() {
        return reader.next();
    }
}
