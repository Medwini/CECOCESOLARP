/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Conexion {

    Connection con;

    Statement stSentencesSQL;
    ResultSet MisDatos;
    PreparedStatement psPrepararSentences;

    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/CooperativaCRP";

    // Funcion que va conectarse a mi bd de mysql
    public Connection getConexion() {
        // Reseteamos a null la conexion a la bd
        con = null;
        try {
            Class.forName(driver);
            // Nos conectamos a la bd
            con = (Connection) DriverManager.getConnection(url, user, pass);
            stSentencesSQL = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (con != null) {
                System.out.println("Conexión Exitosa");
            }
        } // Si la conexion NO fue exitosa mostramos un mensaje de error
        //Y se cierra el software
        catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
            int i = 0;
            System.exit(i);
        }
        return con;
    }

    public ResultSet consulta(String sql) {
        try {
            MisDatos = stSentencesSQL.executeQuery(sql);
        } catch (Exception e) {

        }

        return MisDatos;
    }

    public DefaultComboBoxModel Obt_Opciones() {
        DefaultComboBoxModel Opciones = new DefaultComboBoxModel();
        Opciones.addElement("Seleccione alguno de nuestros de productos...");
        ResultSet res = this.consulta("SELECT Cod_Productos, Nombre FROM Productos ORDER BY Cod_Productos");
        int Cod_Productos = 0;
        try {
            while (res.next()) {
                Opciones.addElement(res.getString("Nombre"));
                Cod_Productos = res.getInt("Cod_Productos");
                System.out.println(Cod_Productos);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return Opciones;
    }
    
    public DefaultComboBoxModel Obt_OpcionesDispo() {
        DefaultComboBoxModel Opciones = new DefaultComboBoxModel();
        Opciones.addElement("Seleccione alguno de nuestros de productos...");
        ResultSet res = this.consulta("SELECT Cod_Disponibles, Nombre FROM Disponibles ORDER BY Cod_Productos");
        int Cod_Productos = 0;
        try {
            while (res.next()) {
                Opciones.addElement(res.getString("Nombre"));
                Cod_Productos = res.getInt("Cod_Disponibles");
                System.out.println(Cod_Productos);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return Opciones;
    }
    
    public int Consult_DispoCod(String Nombre) {
        int Cod_Prod = 0;
        ResultSet res = this.consulta("SELECT Cod_Productos FROM Productos WHERE Nombre ='" + Nombre + "'");

        try {
            while (res.next()) {
                Cod_Prod = res.getInt("Cod_Productos");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return Cod_Prod;
    }
    
    public double Consult_DispoPrecioU(int Cod_Producto) {
        double PrecioU = 0;
        ResultSet res = this.consulta("SELECT Precio_Unitario FROM Productos WHERE Cod_Productos ='" + Cod_Producto + "'");

        try {
            while (res.next()) {
                PrecioU = res.getInt("Precio_Unitario");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return PrecioU;
    }
    
    public String Consult_DispoDescrip(int Cod_Producto) {
        String Descrip = null;
        ResultSet res = this.consulta("SELECT Descripcion FROM Productos WHERE Cod_Productos ='" + Cod_Producto + "'");

        try {
            while (res.next()) {
                Descrip = res.getString("Descripcion");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return Descrip;
    }

    public DefaultComboBoxModel Obt_OpcionesMoneda() {
        DefaultComboBoxModel Opciones = new DefaultComboBoxModel();
        Opciones.addElement("Seleccione el tipo de moneda que utilizará...");
        ResultSet res = this.consulta("SELECT Nombre FROM Moneda ORDER BY Cod_Moneda");

        try {
            while (res.next()) {
                Opciones.addElement(res.getString("Nombre"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return Opciones;
    }

    public double Consult_Valor(String Nombre) {
        double Tasa = 0;
        ResultSet res = this.consulta("SELECT Valor FROM Moneda WHERE Nombre ='" + Nombre + "'");

        try {
            while (res.next()) {
                Tasa = res.getDouble("Valor");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return Tasa;
    }
    
    public String Consult_Moneda(String Nombre) {
        String Moneda = null;
        ResultSet res = this.consulta("SELECT Moneda FROM Moneda WHERE Nombre ='" + Nombre + "'");

        try {
            while (res.next()) {
                Moneda = res.getString("Moneda");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return Moneda;
    }

    public String Consultar_Cont() {
        String Clav = null;
        ResultSet res = this.consulta("SELECT Clave FROM Usuarios WHERE Cod_Us = 1");

        try {
            while (res.next()) {
                Clav = res.getString("Clave");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return Clav;
    }

    public int Consultar_Prod(String Nombre) {
        int Cod_Prod = 0;
        ResultSet res = this.consulta("SELECT Cod_Productos FROM Productos WHERE Nombre = '" + Nombre + "'");
        try {
            while (res.next()) {
                Cod_Prod = res.getInt("Cod_Productos");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return Cod_Prod;
    }

//    public boolean Deshabilitar_Prod(String Nombre){
//        boolean eliminado = false;
//        ResultSet res = this.consulta("DELETE FROM Disponibles WHERE Nombre = '"+Nombre+"'");
//        return eliminado;
//    }
//    public DefaultComboBoxModel Consulta_Moneda(){
//        DefaultComboBoxModel CMoneda = new DefaultComboBoxModel();
//        ResultSet res = this.consulta("SELECT Valor FROM Moneda");
//        
//       try{
//           while(res.next()){
//               CMoneda.addElement(res.getFloat("Valor"));
//           }
//       }catch(SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
//       }
//       return CMoneda;
//    }
    public void desconectar() {
        con = null;
        if (con == null) {
            System.out.println("BD Desconectada");
        }
    }

}
