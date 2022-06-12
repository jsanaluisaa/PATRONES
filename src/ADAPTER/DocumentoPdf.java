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
public class DocumentoPdf implements Documento {

    protected ComponentePdf herramientaPdf = new ComponentePdf();

    public void setContenido(String contenido) {
        herramientaPdf.pdfFijaContenido(contenido);
    }

    public void dibuja() {
        herramientaPdf.pdfPreparaVisualizacion();
        herramientaPdf.pdfRefresca();
        herramientaPdf.pdfFinalizaVisualizacion();
    }

    public void imprime() {
        herramientaPdf.pdfEnviaImpresora();
    }
}
