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
    private String idEmpleado;
    private Calendar fecha;
    private int horasTrabajadas;

    public TarjetaDiaria(String idEmpleado, Calendar fecha, int cantidadHoras) {
        this.fecha = fecha;
        this.horasTrabajadas = cantidadHoras;
        this.idEmpleado = idEmpleado;
    }
    
    public int getHorasExtras()
    {
        int hora = this.fecha.get(Calendar.HOUR_OF_DAY);
        int horafinal = hora+ this.horasTrabajadas;
        if (horasTrabajadas>8) {
            return horasTrabajadas-8;
        }
        return 0;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    void guardar() {
        //llamar a datos
    }
}
