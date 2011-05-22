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
    private int contadorDeViernes;

    public ControladorDeFecha(int dia, int mes, int anio)
    {
       this.fechaActual = Calendar.getInstance();
       fechaActual.set(anio,mes,dia);
    }
    
    public boolean esViernes()
    {
        int dia = fechaActual.get(Calendar.DAY_OF_WEEK);
        return dia==5;
    }
    
    public void incrementarContadorDeViernes()
    {
        this.contadorDeViernes+= 1;
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
        this.fechaActual.add(Calendar.DAY_OF_MONTH, 1);
        this.fechaActual.roll(Calendar.DAY_OF_MONTH,true);
        if (fechaActual.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
            this.contadorDeViernes++;
        }
    }
   /*  public boolean esViernesPar() {
        Calendar cal = Calendar.getInstance();
        cal.set(fechaActual.YEAR, 0, 1);//revisar metodo raro
        int ultimoDia = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        cal.set(Calendar.DAY_OF_MONTH, ultimoDia);
         for (int i = 0; cal.before(fechaActual); i++) {
             cal.add(Calendar.DAY, i);
         }
        return  true;
    }
 */
}
