
package datos;


import domain.Padres;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PadresJDBC {
     private static final String sql_Select = "SELECT * FROM padres";
     
     private static final String selectUpdate = "SELECT * FROM padres WHERE Dni=?";
     
    private static final String buscador = "SELECT * FROM padres WHERE DniAlumno=?";
    
    private static final String buscadorApellido = "SELECT * FROM padres WHERE Apellido Like ?||'%'";
    
    private static final String sql_Update = "UPDATE padres SET DniAlumno=?,RelacionAlumno=?,Apellido=?,Nombres=?,FechaN=?,Nacionalidad=?,Profesion=?,Celular=?,Email=?,Direccion=?,Vive_Con_Alumno=? WHERE Dni = ?";
    private static final String sql_Delete = "DELETE FROM padres WHERE Dni = ?";
    private static final String sql_Insert = "INSERT INTO alumnos(Marca_Temporal, Dni, DniAlumno, RelacionAlumno, Apellido, Nombres, FechaN, Nacionalidad, Profesion, Celular, Email, Direccion, Vive_Con_Alumno) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
    
    public List<Padres> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Padres> al = new ArrayList();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(sql_Select);
            rs = stmt.executeQuery();
            
            while (rs.next()) {//busca si hay un campo siguiente. si no lo hay sale del while
                
                String MarcaTemporal = rs.getString(1);
                int Dni = rs.getInt(2);
                int DniAlumno = rs.getInt(3);    
                String RelacionAlumno = rs.getString(4);
                String Apellido = rs.getString(5);
                String Nombres = rs.getString(6);
                String FechaN = rs.getString(7);
                String Nacionalidad = rs.getString(8);
                String Profesion = rs.getString(9);
                String celular = rs.getString(10);
                String Email = rs.getString(11);
                String Direccion = rs.getString(12);
                String Vive_Con_Alumno = rs.getString(13);
                                
                al.add(new Padres(MarcaTemporal,Dni,DniAlumno,RelacionAlumno,Apellido,Nombres,FechaN,Nacionalidad,Profesion,celular,Email,Direccion,Vive_Con_Alumno));
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
    
    public int insert(Padres p1) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(sql_Insert);
//            stmt.setInt(1, p1.getId_producto());
            stmt.setString(1, p1.getMarcaTemporal());
            stmt.setInt(2, p1.getDni());
            stmt.setInt(3, p1.getDniAlumno());
            stmt.setString(4, p1.getRelacionAlumno());
            stmt.setString(5, p1.getApellido());
            stmt.setString(6, p1.getNombre());
            stmt.setString(7, p1.getFechaN());
            stmt.setString(8, p1.getNacionalidad());
            stmt.setString(9, p1.getProfesion());
            stmt.setString(10, p1.getCelular());
            stmt.setString(11, p1.getEmail());
            stmt.setString(12, p1.getDireccion());
            stmt.setString(13, p1.getVive_Con_Alumo());
            

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
    
    public List<Padres> buscador(int dniR) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
//        int rows=0;
        ArrayList<Padres> al = new ArrayList();
        try {
            conn = Conexion.getConnection();
            
            stmt = conn.prepareStatement(buscador);    
            
            stmt.setInt(1, dniR);
            
//            rows = stmt.executeUpdate();  
            
            rs = stmt.executeQuery();     
            
             while (rs.next()) {//busca si hay un campo siguiente. si no lo hay sale del while
                String MarcaTemporal = rs.getString(1);
                int Dni = rs.getInt(2);
                int DniAlumno = rs.getInt(3);    
                String RelacionAlumno = rs.getString(4);
                String Apellido = rs.getString(5);
                String Nombres = rs.getString(6);
                String FechaN = rs.getString(7);
                String Nacionalidad = rs.getString(8);
                String Profesion = rs.getString(9);
                String celular = rs.getString(10);
                String Email = rs.getString(11);
                String Direccion = rs.getString(12);
                String Vive_Con_Alumno = rs.getString(13);
                                
                al.add(new Padres(MarcaTemporal,Dni,DniAlumno,RelacionAlumno,Apellido,Nombres,FechaN,Nacionalidad,Profesion,celular,Email,Direccion,Vive_Con_Alumno));
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
    
    
    public List<Padres> buscadorApellido(String dniR) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
//        int rows=0;
        ArrayList<Padres> al = new ArrayList();
        try {
            conn = Conexion.getConnection();
            
            stmt = conn.prepareStatement(buscadorApellido);    
            
            stmt.setString(1, dniR + "%");
            
//            rows = stmt.executeUpdate();  
            
            rs = stmt.executeQuery();     
            
             while (rs.next()) {//busca si hay un campo siguiente. si no lo hay sale del while
                String MarcaTemporal = rs.getString(1);
                int Dni = rs.getInt(2);
                int DniAlumno = rs.getInt(3);    
                String RelacionAlumno = rs.getString(4);
                String Apellido = rs.getString(5);
                String Nombres = rs.getString(6);
                String FechaN = rs.getString(7);
                String Nacionalidad = rs.getString(8);
                String Profesion = rs.getString(9);
                String celular = rs.getString(10);
                String Email = rs.getString(11);
                String Direccion = rs.getString(12);
                String Vive_Con_Alumno = rs.getString(13);
                                
                al.add(new Padres(MarcaTemporal,Dni,DniAlumno,RelacionAlumno,Apellido,Nombres,FechaN,Nacionalidad,Profesion,celular,Email,Direccion,Vive_Con_Alumno));
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
    
    
    
    
    public int update(Padres persona) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query: "+sql_Update);
            stmt = conn.prepareStatement(sql_Update);

            
            stmt.setInt(12, persona.getDni());
            stmt.setInt(1, persona.getDniAlumno());
            stmt.setString(2, persona.getRelacionAlumno());
            stmt.setString(3, persona.getApellido());
            stmt.setString(4, persona.getNombre());
            stmt.setString(5, persona.getFechaN());
            stmt.setString(6, persona.getNacionalidad());
            stmt.setString(7, persona.getProfesion());
            stmt.setString(8, persona.getCelular());
            stmt.setString(9, persona.getEmail());
            stmt.setString(10, persona.getDireccion());
            stmt.setString(11, persona.getVive_Con_Alumo());
            
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
    
    public List<Padres> selectUpdate(String dniIngresado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Padres> al = new ArrayList();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(selectUpdate);
            
            stmt.setString(1, dniIngresado);
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {//busca si hay un campo siguiente. si no lo hay sale del while
                String MarcaTemporal = rs.getString(1);
                int Dni = rs.getInt(2);
                int DniAlumno = rs.getInt(3);    
                String RelacionAlumno = rs.getString(4);
                String Apellido = rs.getString(5);
                String Nombres = rs.getString(6);
                String FechaN = rs.getString(7);
                String Nacionalidad = rs.getString(8);
                String Profesion = rs.getString(9);
                String celular = rs.getString(10);
                String Email = rs.getString(11);
                String Direccion = rs.getString(12);
                String Vive_Con_Alumno = rs.getString(13);
                                
                al.add(new Padres(MarcaTemporal,Dni,DniAlumno,RelacionAlumno,Apellido,Nombres,FechaN,Nacionalidad,Profesion,celular,Email,Direccion,Vive_Con_Alumno));
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


