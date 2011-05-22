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
    private Sueldo sueldo;

    public EmpleadoPorHoras(){
        sueldo=new SueldoEmpleadoPorHora();
    }
    
    public double calcularSueldo(Calendar fechaInicio,Calendar fechaFin){
        ArrayList<TarjetaDiaria> tarjetasMes = tarjetasEnMes(fechaInicio,fechaFin);
        return 0.0;
    }

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




    
}
