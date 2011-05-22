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
    private String idEmpleado;
    private String descripcionServicio;
    private Double monto;
    private Calendar fecha;
    
   public Servicio(String idEmpleado, String descripcion, Double monto, Calendar fecha)
   {
       this.idEmpleado = idEmpleado;
       this.descripcionServicio = descripcion;
       this.monto = monto;
       this.fecha = fecha;
   }
   public void guardar()
   {
       //llamar a Datos
   }
   public Double getMonto()
   {
       return this.monto;
   }
}
