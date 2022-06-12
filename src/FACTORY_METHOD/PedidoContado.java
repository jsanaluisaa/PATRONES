/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FACTORY_METHOD;

/**
 *
 * @author PXNDX
 */
public class PedidoContado extends Pedido {

    public PedidoContado(double importe) {
        super(importe);
    }

    public void paga() {
        System.out.println(
                "El pago del pedido por importe de: "
                + importe + " se ha realizado.");
    }

    public boolean valida() {
        return true;
    }
}
