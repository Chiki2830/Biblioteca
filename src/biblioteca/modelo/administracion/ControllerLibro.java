
package biblioteca.modelo.administracion;

import biblioteca.modelo.entidades.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ControllerLibro {

    PreparedStatement ps;
    ResultSet rs;
    Conexion con = new Conexion();
    Connection acceso;

    public void insertar(Libro lib) {

        try {
            String sql = "insert into libro(autor,titulo,cantidad,estado) values(?,?,?,?)";
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, lib.getAutor());
            ps.setObject(2, lib.getTitulo());
            ps.setObject(3, lib.getCantidad());
            ps.setObject(4, 1);
            ps.executeUpdate();

        } catch (Exception e) {
        }

    }

    public ArrayList<Libro> consulta() {
        
        ArrayList<Libro> listalibro = new ArrayList<>();

        try {

            String sql = "select * from libro";
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Libro lib = new Libro();
                lib.setIsbn(rs.getInt(1));
                lib.setAutor(rs.getString(2));
                lib.setTitulo(rs.getString(3));
                lib.setCantidad(rs.getInt(4));
                lib.setEstado(rs.getInt(5));
                listalibro.add(lib);
            }

        } catch (Exception e) {
        }

        return listalibro;
    }

     public void actualizar(Libro lib) {
        String sql = "update libro set autor=?,titulo=?,cantidad=?,estado=? where idlibro=?";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, lib.getAutor());
            ps.setObject(2, lib.getTitulo());
            ps.setObject(3, lib.getCantidad());
            ps.setObject(4, lib.getEstado());
            ps.setObject(5, lib.getIsbn());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
     
    public void eliminar(int id) {
        String sql = "update libro set estado=? where idlibro=?";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, 0);
            ps.setObject(2, id);
            
            ps.executeUpdate();
        } catch (Exception e) {
        }
    } 
    
     public void habilitar(int id) {
        String sql = "update libro set estado=? where idlibro=?";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, 1);
            ps.setObject(2, id);
            
            ps.executeUpdate();
        } catch (Exception e) {
        }
    } 
     
    
}
