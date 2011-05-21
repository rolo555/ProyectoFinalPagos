/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author HP
 */
public abstract class FormaDePago {

    private static String pagoARecursosHumanos = "RH";
    private static String pagoADireccion = "Direccion";
    public static String pagoABanco = "Banco";

    public abstract void enviarCheque();
    public abstract void enviarPapeleta(PapeletaDePago papeleta);

    public void pagar(PapeletaDePago papeleta){
        enviarCheque();
        enviarPapeleta(papeleta);
    }
    public static FormaDePago factoryformaDePago(String formaDePagoString)
    {
        FormaDePago formaDePago = null;
        if (formaDePagoString.equals(pagoABanco)) {
            return new PagoABanco();
        }
        if (formaDePagoString.equals(pagoADireccion)|| formaDePagoString.equals(pagoARecursosHumanos)) {
            return new PagoADireccion();
        }
        return formaDePago;
    }
}
