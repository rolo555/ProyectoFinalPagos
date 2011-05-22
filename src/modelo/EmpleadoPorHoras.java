/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author HP
 */
public class EmpleadoPorHoras extends Empleado{
    private ArrayList<TarjetaDiaria> tarjetas = new ArrayList<TarjetaDiaria>();

    public ArrayList<TarjetaDiaria> tarjetasEnMes(Calendar inicio, Calendar Fin){
        for(TarjetaDiaria tarjeta: tarjetas){

        }
        return tarjetas;
    }

    public void llenarTarjetaDiaria(Calendar fecha, int cantidadHoras)
    {
        TarjetaDiaria tarjeta = new TarjetaDiaria(this.idEmpleado, fecha, cantidadHoras);
        tarjeta.guardar();
    }
    public ArrayList<TarjetaDiaria> getTarjetas(Calendar fechaInicio, Calendar fechaFin){
        ArrayList<TarjetaDiaria> tarjetasMes = new ArrayList<TarjetaDiaria>();
        for(TarjetaDiaria tarjeta: tarjetas){
            if(tarjeta.getFecha().after(fechaInicio) && tarjeta.getFecha().before(fechaFin)){
                tarjetasMes.add(tarjeta);
            }
        }
        return tarjetasMes;

        }

    public double getSueldo(Calendar fechaInicio, Calendar fechaFin) {
        double sueldo = 0;
        ArrayList<TarjetaDiaria> tarjetasPorMes = getTarjetas(fechaInicio, fechaFin);
        for (int i = 0; i < tarjetasPorMes.size(); i++) {
            sueldo += tarjetasPorMes.get(i).getHorasTrabajadas()*this.sueldoFijo;
            sueldo += tarjetasPorMes.get(i).getHorasExtras()*1.5/100;
        }
        return sueldo;
    }

}
