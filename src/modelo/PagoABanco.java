/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author HP
 */
public class PagoABanco extends FormaDePago{

   
    public void enviarCheque(String banco) {
        System.out.println("Enviando cheque a: "+ banco);
    }

    public void enviarPapeleta(PapeletaDePago papeleta, String email) {
        papeleta.enviarPorCorreo(email);
    }


    
}
