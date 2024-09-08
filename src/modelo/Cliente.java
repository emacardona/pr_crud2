/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author emanu
 */
public class Cliente extends Persona {
    private String nit;
    private int id,id_puestos;
    Conexion cn;
    
    
    public Cliente(){};
    
    public Cliente(String nit, int id, int idPuesto, String nombre, String apellidos, String direccion, String telefono, String fechaNacimiento) {
    super(nombre, apellidos, direccion, telefono, fechaNacimiento);
    this.id = id;
    this.nit = nit;
    this.id_puestos = id_puestos;
}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
     public int getId_puestos() {
        return id_puestos;
    }

    public void setId_puestos(int id_puestos) {
        this.id_puestos = id_puestos;
    }
    
    public DefaultTableModel leer() {
    DefaultTableModel tabla = new DefaultTableModel();
    try {
        cn = new Conexion();
        cn.abrir_conexion();
        String query = "SELECT e.id_cliente as id, e.nit, e.nombres, e.apellidos, e.direccion, e.telefono, e.fecha_nacimiento, " +
                       "CONCAT(p.id_Puestos, ') ', p.puesto) as puesto " +
                       "FROM clientes e INNER JOIN puestos p ON e.id_puestos = p.id_Puestos;";
        ResultSet consulta = cn.conexionBD.createStatement().executeQuery(query);
        
        String encabezado[] = {"ID", "NIT", "Nombres", "Apellidos", "Direccion", "Telefono", "Nacimiento", "Puesto"};
        tabla.setColumnIdentifiers(encabezado);
        String datos[] = new String[8];
        while (consulta.next()) {
            datos[0] = consulta.getString("id");
            datos[1] = consulta.getString("nit");
            datos[2] = consulta.getString("nombres");
            datos[3] = consulta.getString("apellidos");
            datos[4] = consulta.getString("direccion");
            datos[5] = consulta.getString("telefono");
            datos[6] = consulta.getString("fecha_nacimiento");
            datos[7] = consulta.getString("puesto");
            tabla.addRow(datos);
        }
        cn.cerrar_conexion();
    } catch (SQLException ex) {
        System.out.println("Error: " + ex.getMessage());
    }
    return tabla;
}




    
    public DefaultComboBoxModel leer_empleado() {
    DefaultComboBoxModel combo = new DefaultComboBoxModel();
    try {
        cn = new Conexion();
        cn.abrir_conexion();
        String query = "SELECT id_cliente as id, CONCAT(nombres, ' ', apellidos) as nombre_completo FROM clientes";
        ResultSet consulta = cn.conexionBD.createStatement().executeQuery(query);
        while (consulta.next()) {
            combo.addElement(consulta.getString("id") + ") " + consulta.getString("nombre_completo"));
        }
        cn.cerrar_conexion();
    } catch (SQLException ex) {
        System.out.println("Error: " + ex.getMessage());
    }
    return combo;
}



    
    public DefaultComboBoxModel id() {
    DefaultComboBoxModel combo = new DefaultComboBoxModel();
    try {
        cn = new Conexion();
        cn.abrir_conexion();
        String query = "SELECT id_Puestos as id, puesto FROM puestos";
        ResultSet consulta = cn.conexionBD.createStatement().executeQuery(query);
        combo.addElement("0) Elija Puesto"); // Elemento inicial
        while (consulta.next()) {
            combo.addElement(consulta.getString("id") + ") " + consulta.getString("puesto"));
        }
        cn.cerrar_conexion();
    } catch (SQLException ex) {
        System.out.println("Error: " + ex.getMessage());
    }
    return combo;
}


    
    public DefaultComboBoxModel puesto(){
    DefaultComboBoxModel  combo = new DefaultComboBoxModel ();
    try{
       cn = new Conexion ();
       cn.abrir_conexion();
       String query;
       query = "SELECT id_Puestos as id,puestos from puesto";
       ResultSet consulta =  cn.conexionBD.createStatement().executeQuery(query);
       combo.addElement("0) Elija Puesto");
                  while (consulta.next())
                    {            
                      combo.addElement(consulta.getString("id")+") "+consulta.getString("puesto"));
                    }
              cn.cerrar_conexion();
              
       
    }catch(SQLException ex){
        System.out.println("Error: " + ex.getMessage() );
    }
    return combo;
    }
    
    @Override
    public void crear (){
    try{
    PreparedStatement parametro;
    cn = new Conexion();
    cn.abrir_conexion();
    
        String query = "INSERT INTO clientes(`nit`,`nombres`,`apellidos`,`direccion`,`telefono`,`fecha_nacimiento`) VALUES(?,?,?,?,?,?);";    
        parametro = (PreparedStatement) cn.conexionBD.prepareStatement(query);
        parametro.setString(1, getNit());
        parametro.setString(2, getNombre());
        parametro.setString(3, getApellidos());
        parametro.setString(4, getDireccion());
        parametro.setString(5, getTelefono());
        parametro.setString(6, getFecha_nacimiento());
        int executar = parametro.executeUpdate();
        System.out.println("Ingreso Exitoso..." + Integer.toString(executar));
        
        cn.cerrar_conexion();
    } catch(SQLException ex) {
    System.out.println("error" + ex.getMessage());
    }
    
    }
           
    @Override
    public void actualizar(){
    try{
    PreparedStatement parametro;
    cn = new Conexion();
    cn.abrir_conexion();
    
        String query = "UPDATE clientes SET nit = ?, nombres = ?, apellidos = ?, direccion = ?, telefono = ?, fecha_nacimiento = ? WHERE id_cliente = ?;";    
        parametro = (PreparedStatement) cn.conexionBD.prepareStatement(query);
        parametro.setString(1, getNit());
        parametro.setString(2, getNombre());
        parametro.setString(3, getApellidos());
        parametro.setString(4, getDireccion());
        parametro.setString(5, getTelefono());
        parametro.setString(6, getFecha_nacimiento());
        parametro.setInt(7, getId());
        int executar = parametro.executeUpdate();
        System.out.println("Modificacinn exitosa..." + Integer.toString(executar));
        
        cn.cerrar_conexion();
    } catch(SQLException ex) {
    System.out.println("error en modificar" + ex.getMessage());
    }
    }
    
 public void eliminar(){
        try{
           PreparedStatement parametro;
           cn = new Conexion();
           cn.abrir_conexion();
           String query = "Delete from clientes WHERE id_cliente = ?;";
           parametro = (PreparedStatement) cn.conexionBD.prepareStatement(query);
           parametro.setInt(1, this.getId());
           int executer = parametro.executeUpdate();
           System.out.println("Eliminacion exitosa");
           cn.cerrar_conexion();
        }catch(SQLException ex){
            System.out.println("Error al eliminar" + ex.getMessage());
        }
 }
   }
    




    
