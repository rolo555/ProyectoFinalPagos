/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author HP
 */
public class TarjetaDiaria {
    private int idEmpleado;
    private Calendar fecha;
    private int horasTrabajadas;

    public TarjetaDiaria(int idEmpleado, Calendar fecha, int cantidadHoras) {
        this.fecha = fecha;
        this.horasTrabajadas = cantidadHoras;
        this.idEmpleado = idEmpleado;
    }
    
    public int getHorasExtras()
    {
        int horaInicio = this.fecha.get(Calendar.HOUR_OF_DAY);
        int horaFinal = horaInicio+ this.horasTrabajadas;
        if (horaInicio>=19) {
            return horasTrabajadas;
        }else
        {
            if (horaFinal > 19) {
                return horaFinal - 19;
            }else{
                return 0;
            }
        }
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public Calendar getFecha(){
        return fecha;
    }

    void guardar() {
        //llamar a datos
    }
}
