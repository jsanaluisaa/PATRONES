/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUILDER;

/**
 *
 * @author PXNDX
 */
public abstract class ConstructorDocumentacionVehiculo {

    protected Documentacion documentacion;

    public abstract void construyeSolicitudPedido(String nombreCliente);

    public abstract void construyeSolicitudMatriculacion(String nombreSolicitante);

    public Documentacion resultado() {
        return documentacion;
    }
}
