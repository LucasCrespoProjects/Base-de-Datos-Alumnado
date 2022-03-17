package datos;

import domain.Alumnos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AlumnosJDBC {
    private static final String sql_Select = "SELECT * FROM alumnos";
    
    private static final String buscador = "SELECT * FROM alumnos WHERE Apellido=?";  
    
    private static final String buscadorLike = "SELECT * FROM alumnos WHERE Apellido Like ?||'%'";    
    
    private static final String buscador_Filtro = "SELECT * FROM alumnos WHERE Curso=?";
    
    private static final String selectUpdate = "SELECT * FROM alumnos WHERE DNI=?";
    
    private static final String sql_Update = "UPDATE alumnos SET Apellido=?, Nombres=?, FechaN=?, Edad=?, Direccion=?, PisoDepto=?, Localidad=?, Correo_Electronico=?, Celular=?, Curso=?, Division=? WHERE DNI = ?";        
    private static final String sql_Delete = "DELETE FROM alumnos WHERE DNI = ?";
    private static final String sql_Insert = "INSERT INTO alumnos(Marca_Temporal, DNI, Apellido, Nombres, FechaN, Edad, Direccion, PisoDepto, Localidad, Correo_Electronico, Celular, Curso, Division) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
    
    public List<Alumnos> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Alumnos> al = new ArrayList();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(sql_Select);
            rs = stmt.executeQuery();
            
            while (rs.next()) {//busca si hay un campo siguiente. si no lo hay sale del while
                String Marca_Temporal= rs.getString(1);
                int dni = rs.getInt(2);
                String apellido = rs.getString(3);
                String nombres = rs.getString(4);
                String fecha = rs.getString(5);
                int edad = rs.getInt(6);
                String direccion = rs.getString(7);
                String piso = rs.getString(8);
                String localidad = rs.getString(9);
                String correo = rs.getString(10);
                String celular=rs.getString(11);
                String curso=rs.getString(12);
                String division=rs.getString(13);
                                
                al.add(new Alumnos(Marca_Temporal,dni, apellido, nombres,fecha, edad, direccion, piso, localidad, correo, celular,curso, division));
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return al;
    }
    
     public int insert(Alumnos p1) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(sql_Insert);
//            stmt.setInt(1, p1.getId_producto());
            stmt.setString(1, p1.getMarca_Temporal());
            stmt.setInt(2, p1.getDNI());
            stmt.setString(3, p1.getApellido());
            stmt.setString(4, p1.getNombre());
            stmt.setString(5, p1.getFecha_N());
            stmt.setInt(6, p1.getEdad());
            stmt.setString(7, p1.getDireccion());
            stmt.setString(8, p1.getPiso_Depto());
            stmt.setString(9, p1.getLocalidad());
            stmt.setString(10, p1.getCorreo());
            stmt.setString(11, p1.getCelular());
            stmt.setString(12, p1.getCurso());
            stmt.setString(13, p1.getDivision());
            

            System.out.println("Ejecutando query: " + sql_Insert);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;

    }
    public List<Alumnos> buscador(String dniR) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
//        int rows=0;
        ArrayList<Alumnos> al = new ArrayList();
        try {
            conn = Conexion.getConnection();
            
            stmt = conn.prepareStatement(buscador);    
            
            stmt.setString(1, dniR);

            
//            rows = stmt.executeUpdate();  
            
            rs = stmt.executeQuery();     
            
             while (rs.next()) {//busca si hay un campo siguiente. si no lo hay sale del while
                String Marca_Temporal= rs.getString(1);
                int dni = rs.getInt(2);
                String apellido = rs.getString(3);
                String nombres = rs.getString(4);
                String fecha = rs.getString(5);
                int edad = rs.getInt(6);
                String direccion = rs.getString(7);
                String piso = rs.getString(8);
                String localidad = rs.getString(9);
                String correo = rs.getString(10);
                String celular=rs.getString(11);
                String curso=rs.getString(12);
                String division=rs.getString(13);
                                
                al.add(new Alumnos(Marca_Temporal,dni, apellido, nombres,fecha, edad, direccion, piso, localidad, correo, celular,curso, division));
            }
            
                     
                                  
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return al;
    }
    
     public List<Alumnos> buscadorLike(String dniR) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
//        int rows=0;
        ArrayList<Alumnos> al = new ArrayList();
        try {
            conn = Conexion.getConnection();
            
            stmt = conn.prepareStatement(buscadorLike);    
            
            stmt.setString(1, dniR + "%");

            
//            rows = stmt.executeUpdate();  
            
            rs = stmt.executeQuery();     
            
             while (rs.next()) {//busca si hay un campo siguiente. si no lo hay sale del while
                String Marca_Temporal= rs.getString(1);
                int dni = rs.getInt(2);
                String apellido = rs.getString(3);
                String nombres = rs.getString(4);
                String fecha = rs.getString(5);
                int edad = rs.getInt(6);
                String direccion = rs.getString(7);
                String piso = rs.getString(8);
                String localidad = rs.getString(9);
                String correo = rs.getString(10);
                String celular=rs.getString(11);
                String curso=rs.getString(12);
                String division=rs.getString(13);
                                
                al.add(new Alumnos(Marca_Temporal,dni, apellido, nombres,fecha, edad, direccion, piso, localidad, correo, celular,curso, division));
            }
            
                     
                                  
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return al;
    }
    
    public List<Alumnos> buscadorFiltro(String año) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Alumnos> al = new ArrayList();
        try {
            conn = Conexion.getConnection();
            
            stmt = conn.prepareStatement(buscador_Filtro);    
            
            stmt.setString(1, año);
              
            
            rs = stmt.executeQuery();     
            
             while (rs.next()) {//busca si hay un campo siguiente. si no lo hay sale del while
                String Marca_Temporal= rs.getString(1);
                int dni = rs.getInt(2);
                String apellido = rs.getString(3);
                String nombres = rs.getString(4);
                String fecha = rs.getString(5);
                int edad = rs.getInt(6);
                String direccion = rs.getString(7);
                String piso = rs.getString(8);
                String localidad = rs.getString(9);
                String correo = rs.getString(10);
                String celular=rs.getString(11);
                String curso=rs.getString(12);
                String division=rs.getString(13);
                                
                al.add(new Alumnos(Marca_Temporal,dni, apellido, nombres,fecha, edad, direccion, piso, localidad, correo, celular,curso, division));
            }
            
                     
                                  
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return al;
    }
    
    public int update(Alumnos persona) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query: "+sql_Update);
            stmt = conn.prepareStatement(sql_Update);

            
            stmt.setInt(12, persona.getDNI());
            stmt.setString(1, persona.getApellido());
            stmt.setString(2, persona.getNombre());
            stmt.setString(3, persona.getFecha_N());
            stmt.setInt(4, persona.getEdad());
            stmt.setString(5, persona.getDireccion());
            stmt.setString(6, persona.getPiso_Depto());
            stmt.setString(7, persona.getLocalidad());
            stmt.setString(8, persona.getCorreo());
            stmt.setString(9, persona.getCelular());
            stmt.setString(10, persona.getCurso());
            stmt.setString(11, persona.getDivision());
            
            rows=stmt.executeUpdate();
            System.out.println("Registros actualizados: "+ rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return rows;
    }
    
    public void delete(int dni){
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query: "+sql_Update);
            stmt = conn.prepareStatement(sql_Delete);
            stmt.setInt(1, dni);
                        
           stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
    }
    
    public List<Alumnos> selectUpdate(String dniIngresado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Alumnos> al = new ArrayList();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(selectUpdate);
            
            stmt.setString(1, dniIngresado);
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {//busca si hay un campo siguiente. si no lo hay sale del while
                String Marca_Temporal= rs.getString(1);
                int dni = rs.getInt(2);
                String apellido = rs.getString(3);
                String nombres = rs.getString(4);
                String fecha = rs.getString(5);
                int edad = rs.getInt(6);
                String direccion = rs.getString(7);
                String piso = rs.getString(8);
                String localidad = rs.getString(9);
                String correo = rs.getString(10);
                String celular=rs.getString(11);
                String curso=rs.getString(12);
                String division=rs.getString(13);
                                
                al.add(new Alumnos(Marca_Temporal,dni, apellido, nombres,fecha, edad, direccion, piso, localidad, correo, celular,curso, division));
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return al;
    }
    
    
    
}
