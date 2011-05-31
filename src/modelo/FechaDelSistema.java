package modelo;


import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Sanchez, Moreales e Ismael
 */
public class FechaDelSistema {

    private Calendar fechaActual;

    public FechaDelSistema(Calendar fecha) {
        this.fechaActual = fecha;
    }

    public void setFecha(int dia, int mes, int anio) {
        fechaActual.set(anio, mes, dia);
    }

    public boolean esViernes() {
        int dia = fechaActual.get(Calendar.DAY_OF_WEEK);
        return dia == 6;
    }

    public int getUltimoDiaHabilDelMes() {
        Calendar cal = Calendar.getInstance();
        cal.set(fechaActual.get(Calendar.YEAR), fechaActual.get(Calendar.MONTH), fechaActual.get(Calendar.DAY_OF_MONTH));
        int ultimoDia = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        cal.set(Calendar.DAY_OF_MONTH, ultimoDia);
        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        } else if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            cal.add(Calendar.DAY_OF_MONTH, -2);
        }
        return cal.get(Calendar.DAY_OF_MONTH);
    }

    public boolean esUltimoDiaDelMes() {
        return getUltimoDiaHabilDelMes() == fechaActual.get(Calendar.DAY_OF_MONTH);
    }

    public void incrementarFecha() {
        this.fechaActual.roll(Calendar.DAY_OF_MONTH, true);
    }

    public boolean esViernesPar() {
        int contadorViernes = 0;
        Calendar cal = Calendar.getInstance();
        cal.set(fechaActual.get(Calendar.YEAR), 0, 1);
        for (int i = 0; cal.before(fechaActual); i++) {
            if (cal.get(Calendar.DAY_OF_WEEK) == 6) {
                contadorViernes++;
            }
            cal.add(Calendar.DATE, 1);
        }
        return contadorViernes % 2 == 0;
    }
}
