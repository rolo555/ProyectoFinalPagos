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

    private String banco;
    private String email;

    public void enviarCheque() {
        System.out.println("Enviando cheque a: "+ banco);
    }

    public void enviarPapeleta(PapeletaDePago papeleta) {
        papeleta.enviarPorCorreo(email);
    }


    
}
