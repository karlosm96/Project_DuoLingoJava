package Persistencia;

import java.util.ArrayList;
import java.util.List;
import Logica.ParPalabra;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Diccionario {


    public Diccionario() {
        
    }

    public boolean agregarPalabra(String sql){
        ConexionDB con = new ConexionDB();
        if(con.setAutoCommitBD(false)){
            if(con.insertarBD(sql)){
                con.commitBD();
                con.cerrarConexion();
                con.cerrarConexion();
                return true;
            }
            else{
                con.rollbackBD();
                con.cerrarConexion();
                System.out.println("Error: Sentencia incorrecta");
                return false;
            }
        }
        else{
            con.cerrarConexion();
            System.out.println("Error");
            return false;
        }
    }

    public List<ParPalabra> DictListaDePalabras(String s){
        List<ParPalabra> listaDePalabras = new ArrayList<>();
        ConexionDB con = new ConexionDB();
        String sql = "SELECT * FROM ListaDePalabras" + s + ";";
        try {
            ResultSet rs = con.consultarBD(sql);
            ParPalabra pp;
            while (rs.next()) {
                pp = new ParPalabra();
                pp.setID(rs.getInt("ID"));
                pp.setEspanol(rs.getString("Espanol"));
                pp.setIngles(rs.getString("Ingles"));
                pp.setCategoria(rs.getString("Categoria"));
                pp.setImagen(rs.getString("Imagen"));
                listaDePalabras.add(pp);
            }
        } catch (SQLException ex) {
            System.out.println("Error: Error al mostrar la tabla:" + ex.getMessage());
        } finally {
            con.cerrarConexion();
        }
        return listaDePalabras;
    }

    public boolean actualizarPalabra(String sqlSent){
        ConexionDB con= new ConexionDB();
        if(con.setAutoCommitBD(false)){
            if(con.actualizarBD(sqlSent)){
                con.commitBD();
                con.cerrarConexion();
            }
            else{
                con.rollbackBD();
                con.cerrarConexion();
                System.out.println("Error: No se pudo actualizar los datos");
                return false;
                }
        }
        else{
            con.cerrarConexion();
            System.out.println("Error");
            return false;
        }
        return true;
    }

    public boolean eliminarPalabra(String sqlSent){
        ConexionDB con = new ConexionDB();
        if (con.setAutoCommitBD(false)){
            if(con.borrarBD(sqlSent)){
                con.commitBD();
                con.cerrarConexion();
            }
            else{
                con.rollbackBD();
                con.cerrarConexion();
                System.out.println("Error: No fue posible Eliminar los datos");
                return false;
                }
        }
        else{
            con.cerrarConexion();       
            System.out.println("Error");
            return false;
        }
        return true;
    }
    
    public boolean consultarPalabra(String sqlSent){
        ConexionDB con = new ConexionDB();
        if(con.setAutoCommitBD(false)){
            con.consultarBD(sqlSent);
            con.cerrarConexion();
            return true;
        }
        else{
            con.cerrarConexion();
            return false;
        }
    }
}
