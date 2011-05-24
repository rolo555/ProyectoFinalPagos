/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author HP
 */
public class PagoADireccion extends FormaDePago{
    
    public void enviarCheque(String direccion) {
        System.out.println("Enviando cheque a: "+ direccion);
    }

    public void enviarPapeleta(PapeletaDePago papeleta, String email) {
      papeleta.imprimir();
    }

}
