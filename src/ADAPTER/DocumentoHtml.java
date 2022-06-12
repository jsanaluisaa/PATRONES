/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADAPTER;

/**
 *
 * @author PXNDX
 */
public class DocumentoHtml implements Documento {

    protected String contenido;

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void dibuja() {
        System.out.println("Dibuja el documento HTML: "
                + contenido);
    }

    public void imprime() {
        System.out.println("Imprime el documento HTML: "
                + contenido);
    }

}
