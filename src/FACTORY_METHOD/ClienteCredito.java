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
public class ClienteCredito extends Cliente {

    protected Pedido creaPedido(double importe) {
        return new PedidoCredito(importe);
    }
}
