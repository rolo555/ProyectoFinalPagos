/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.PagosDBHelper;

/**
 *
 * @author HP
 */
public abstract class FormaDePago {

    private static String pagoARecursosHumanos = "A recursos humanos";
    private static String pagoADireccion = "A direccion";
    public static String pagoABanco = "A banco";

    public abstract void enviarCheque(String banco);
    public abstract void enviarPapeleta(PapeletaDePago papeleta, String direccion);

    public void pagar(PapeletaDePago papeleta, String direccion, String banco){
        enviarCheque(banco);
        enviarPapeleta(papeleta, direccion);
        PagosDBHelper.registrarPago(papeleta);
    }
    public static FormaDePago factoryformaDePago(String formaDePagoString)
    {
        FormaDePago formaDePago = null;
        System.out.println("forma de pago:" + formaDePagoString);

        if (formaDePagoString.equals(pagoABanco)) {
            return new PagoABanco();
        }
        if (formaDePagoString.equals(pagoADireccion)|| formaDePagoString.equals(pagoARecursosHumanos)) {
            return new PagoADireccion();
        }
        return formaDePago;
    }
}
