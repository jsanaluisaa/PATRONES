/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COMPOSITE;

/**
 *
 * @author PXNDX
 */
import java.util.*;

public class EmpresaMadre extends Empresa {

    protected List<Empresa> filiales
            = new ArrayList<Empresa>();

    public boolean agregaFilial(Empresa filial) {
        return filiales.add(filial);
    }

    public double calculaCosteMantenimiento() {
        double coste = 0.0;
        for (Empresa filial : filiales) {
            coste = coste + filial.calculaCosteMantenimiento();
        }
        return coste + nVehiculos * costeUnitarioVehiculo;
    }
}
