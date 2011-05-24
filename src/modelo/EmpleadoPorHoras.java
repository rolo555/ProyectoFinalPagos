/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.SqlConnection;
import datos.TarjetaDiariaDBHelper;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author HP
 */
public class EmpleadoPorHoras extends Empleado{
    private ArrayList<TarjetaDiaria> tarjetas = new ArrayList<TarjetaDiaria>();



    public ArrayList<TarjetaDiaria> tarjetasEnMes(Calendar inicio, Calendar Fin){
        return TarjetaDiariaDBHelper.getTarjetasDiarias(inicio, Fin, idEmpleado);
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
            sueldo += tarjetasPorMes.get(i).calcularHorasExtras()*(1.5/100*this.sueldoFijo);
        }
        return sueldo;
    }

     public String guardar() {
        String consulta;
            consulta = "Insert into empleado (id, nombre_completo, telefono, direccion, correo_electronico, tipo_de_pago, sueldo_fijo, aporte_jubilacion,tipo_empleado)Values ('" + this.idEmpleado + "','" + this.nombreCompleto + "','" + this.telefono + "','" + this.direccion + "','"+ this.correoElectronico + "','" + this.formaDePago+"','" + this.sueldoFijo+"', '" + this.aporteJubilacion+"','"+Empleado.EmpleadoPorHora+"')";
        try {
            SqlConnection.conectar();
            SqlConnection.ejecutar(consulta);
            SqlConnection.desconectar();
            System.out.println(consulta);
         } catch (Exception e) {
            System.out.println(e.getMessage());
            return e.getMessage();
        }
        return "Exito";
    }

}
