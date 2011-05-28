/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import modelo.Empleado;
import modelo.EmpleadoFijo;
import modelo.EmpleadoPorHoras;

public class EmpleadoDBHelper {

    public static boolean setAporteJubilacion(int idEmpleado, double aporteJubilacion) {
        boolean exito = true;
        String consulta = "UPDATE empleado SET aporte_jubilacion = '" + aporteJubilacion + "' WHERE id = '" + idEmpleado + "'";
        try {
            SqlConnection.conectar();
            SqlConnection.ejecutar(consulta);
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.printf(e.getMessage());
            exito = false;
        }
        return exito;
    }

    public static ArrayList<String> getStringEmpleadosConComision() {
        ArrayList<String> empleados = new ArrayList<String>();
        String consulta = "SELECT * FROM empleado WHERE porcentaje_comision != '-1'";
        try {
            SqlConnection.conectar();
            ResultSet rs = SqlConnection.ejecutarResultado(consulta);
            while (rs.next()) {
                String empleado = rs.getString("id") + "-" + rs.getString("nombre_completo");
                empleados.add(empleado);
            }
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
        return empleados;
    }

    public static ArrayList<String> getStringEmpleadosDelSindicato() {
        ArrayList<String> empleadosSinSindicato = new ArrayList<String>();
        String consulta = "SELECT id, nombre_completo FROM empleado WHERE aporte_jubilacion != '-1'";
        try {
            SqlConnection.conectar();
            ResultSet rs = SqlConnection.ejecutarResultado(consulta);
            String idNombre;
            String id;
            String nombre;
            while (rs.next()) {
                id = String.valueOf(rs.getInt("id"));
                nombre = rs.getString("nombre_completo");
                idNombre = id + "-" + nombre;
                empleadosSinSindicato.add(idNombre);
            }
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return empleadosSinSindicato;
    }

    public static ArrayList<String> getStringEmpleadosSinSindicato() {
        ArrayList<String> empleadosSinSindicato = new ArrayList<String>();
        String consulta = "SELECT id, nombre_completo FROM empleado WHERE aporte_jubilacion = '-1'";
        try {
            SqlConnection.conectar();
            ResultSet rs = SqlConnection.ejecutarResultado(consulta);
            String idNombre;
            String id;
            String nombre;
            while (rs.next()) {
                id = String.valueOf(rs.getInt("id"));
                nombre = rs.getString("nombre_completo");
                idNombre = id + "-" + nombre;
                empleadosSinSindicato.add(idNombre);
            }
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return empleadosSinSindicato;
    }

    public static ArrayList<String> getStringEmpleadosPorHora() {
        ArrayList<String> empleados = new ArrayList<String>();
        String consulta = "SELECT * FROM empleado WHERE tipo_empleado = '" + Empleado.EmpleadoPorHora + "'";
        try {
            SqlConnection.conectar();
            ResultSet rs = SqlConnection.ejecutarResultado(consulta);
            while (rs.next()) {
                String empleado = rs.getString("id") + "-" + rs.getString("nombre_completo");
                empleados.add(empleado);
            }
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
        return empleados;
    }

    public static boolean existeEmpleado(int idEmpleado) {
        String consulta = "SELECT * FROM empleado WHERE id = '" + idEmpleado + "'";
        boolean existe = false;
        try {
            SqlConnection.conectar();
            ResultSet rs = SqlConnection.ejecutarResultado(consulta);
            if (rs.next()) {
                existe = true;
            }
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return existe;
    }

    public static ArrayList<Empleado> getEmpleadosPorHora() {
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        String consulta = "SELECT * FROM empleado WHERE tipo_empleado = '" + Empleado.EmpleadoPorHora + "'";
        EmpleadoPorHoras empleado;
        try {
            SqlConnection.conectar();
            ResultSet rs = SqlConnection.ejecutarResultado(consulta);
            while (rs.next()) {
                empleado = new EmpleadoPorHoras();
                empleado.setArgumentosDeEmpleado(rs.getInt("id"), rs.getString("nombre_completo"), rs.getInt("telefono"), rs.getString("direccion"), rs.getString("correo_electronico"), rs.getDouble("sueldo_fijo"), rs.getString("tipo_de_pago"), rs.getString("direccion_de_pago"), rs.getDouble("aporte_jubilacion"));
                empleados.add(empleado);
            }
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
        return empleados;
    }

    public static ArrayList<Empleado> getEmpleadosFijo() {
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        String consulta = "SELECT * FROM empleado WHERE tipo_empleado = '" + Empleado.EmpleadoFijo + "'";
        EmpleadoFijo empleado;
        try {
            SqlConnection.conectar();
            ResultSet rs = SqlConnection.ejecutarResultado(consulta);
            while (rs.next()) {
                empleado = new EmpleadoFijo(rs.getDouble("porcentaje_comision"));
                empleado.setArgumentosDeEmpleado(rs.getInt("id"), rs.getString("nombre_completo"), rs.getInt("telefono"), rs.getString("direccion"), rs.getString("correo_electronico"), rs.getDouble("sueldo_fijo"), rs.getString("tipo_de_pago"), rs.getString("direccion_de_pago"), rs.getDouble("aporte_jubilacion"));
                empleados.add(empleado);
            }
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
        return empleados;
    }

    public static ArrayList<EmpleadoFijo> getEmpleadosConComision() {
        ArrayList<EmpleadoFijo> empleados = new ArrayList<EmpleadoFijo>();
        String consulta = "SELECT * FROM empleado WHERE tipo_empleado = '" + Empleado.EmpleadoConComision + "'";
        EmpleadoFijo empleado;
        try {
            SqlConnection.conectar();
            ResultSet rs = SqlConnection.ejecutarResultado(consulta);
            while (rs.next()) {
                empleado = new EmpleadoFijo(rs.getDouble("porcentaje_comision"));
                empleado.setArgumentosDeEmpleado(rs.getInt("id"), rs.getString("nombre_completo"), rs.getInt("telefono"), rs.getString("direccion"), rs.getString("correo_electronico"), rs.getDouble("sueldo_fijo"), rs.getString("tipo_de_pago"), rs.getString("direccion_de_pago"), rs.getDouble("aporte_jubilacion"));
                empleados.add(empleado);
            }
            SqlConnection.desconectar();
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
        return empleados;
    }

    public void guardarEmpleadoFijo(EmpleadoFijo empleado) {
        String consulta;
        if (empleado.porcentajeComision != -1) {
            consulta = "Insert into empleado (id, nombre_completo, telefono, direccion, correo_electronico, tipo_de_pago, sueldo_fijo, aporte_jubilacion,tipo_empleado, porcentaje_comision)Values ('" + empleado.idEmpleado + "','" + empleado.nombreCompleto + "','" + empleado.telefono + "','" + empleado.direccion + "','" + empleado.correoElectronico + "','" + empleado.formaDePago + "','" + empleado.sueldoFijo + "', '" + empleado.aporteJubilacion + "','" + Empleado.EmpleadoConComision + "', '" + empleado.porcentajeComision + "')";
        } else {
            consulta = "Insert into empleado (id, nombre_completo, telefono, direccion, correo_electronico, tipo_de_pago, sueldo_fijo, aporte_jubilacion,tipo_empleado)Values ('" + empleado.idEmpleado + "','" + empleado.nombreCompleto + "','" + empleado.telefono + "','" + empleado.direccion + "','" + empleado.correoElectronico + "','" + empleado.formaDePago + "','" + empleado.sueldoFijo + "', '" + empleado.aporteJubilacion + "','" + Empleado.EmpleadoFijo + "')";
        }
        try {
            SqlConnection.conectar();
            SqlConnection.ejecutar(consulta);
            SqlConnection.desconectar();
            System.out.println(consulta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void guardarEmpleadoPorHora(EmpleadoPorHoras empleado) {
        String consulta = "Insert into empleado (id, nombre_completo, telefono, direccion, correo_electronico, tipo_de_pago, sueldo_fijo, aporte_jubilacion,tipo_empleado, porcentaje_comision)Values ('" + empleado.idEmpleado + "','" + empleado.nombreCompleto + "','" + empleado.telefono + "','" + empleado.direccion + "','" + empleado.correoElectronico + "','" + empleado.formaDePago + "','" + empleado.sueldoFijo + "', '" + empleado.aporteJubilacion + "','" + Empleado.EmpleadoPorHora + "','-1')";
        try {
            SqlConnection.conectar();
            SqlConnection.ejecutar(consulta);
            SqlConnection.desconectar();
            System.out.println(consulta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
