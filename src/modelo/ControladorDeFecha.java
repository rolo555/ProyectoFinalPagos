/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author HP
 */
public class ControladorDeFecha {
    private Calendar fechaActual;
    public ControladorDeFecha(int dia, int mes, int anio)
    {
       this.fechaActual = Calendar.getInstance();
       fechaActual.set(anio,mes,dia);
    }
    
    public void setFecha(int dia, int mes, int anio)
    {
       fechaActual.set(anio,mes,dia);
    }

    public boolean esViernes()
    {
        int dia = fechaActual.get(Calendar.DAY_OF_WEEK);
        return dia==5;
    }

    public int getUltimoDiaHabilDelMes() {
        Calendar cal = fechaActual;//revisar metodo raro
        int ultimoDia = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        cal.set(Calendar.DAY_OF_MONTH, ultimoDia);
        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        } else if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            cal.add(Calendar.DAY_OF_MONTH, -2);
        }
        return  cal.get(Calendar.DAY_OF_MONTH);
    }
    public boolean esUltimoDiaDelMes()
    {
        return getUltimoDiaHabilDelMes()==fechaActual.get(Calendar.DAY_OF_MONTH);
    }
    public void incrementarFecha()
    {
        this.fechaActual.roll(Calendar.DAY_OF_MONTH,true);
    }
    public boolean esViernesPar() {
        int contadorViernes = 0;
        Calendar cal = Calendar.getInstance();
        cal.set(fechaActual.get(Calendar.YEAR), 0, 1);//revisar metodo raro
        int ultimoDia = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        cal.set(Calendar.DAY_OF_MONTH, ultimoDia);
         for (int i = 0; cal.before(fechaActual); i++) {
             cal.add(Calendar.DAY_OF_MONTH, 1);
             if (cal.get(Calendar.DAY_OF_WEEK) == 5) {
                 contadorViernes++;
             }
         }
        return  contadorViernes%2 == 0;
    }
}
