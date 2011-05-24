/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;

/**
 *
 * @author HP
 */
public class Servicio {
    public int idEmpleado;
    public String descripcionServicio;
    public Double monto;
    public Calendar fecha;
    
   public Servicio(int idEmpleado, String descripcion, Double monto, Calendar fecha)
   {
       this.idEmpleado = idEmpleado;
       this.descripcionServicio = descripcion;
       this.monto = monto;
       this.fecha = fecha;
   }

   public Double getMonto()
   {
       return this.monto;
   }
}
