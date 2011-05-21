/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author HP
 */
public class Servicio {
    private String idEmpleado;
    private String descripcionServicio;
    private Double monto;
    
   public Servicio(String idEmpleado, String descripcion, Double monto)
   {
       this.idEmpleado = idEmpleado;
       this.descripcionServicio = descripcion;
       this.monto = monto;
   }
   public void guardar()
   {
       //llamar a Datos
   }
   public Double getMonto()
   {
       return this.monto;
   }
   public boolean usadoPor(String idEmpleado)
   {
       return this.idEmpleado==idEmpleado;
   }
}
