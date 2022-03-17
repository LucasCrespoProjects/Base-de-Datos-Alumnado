package domain;

public class Padres {

    private String MarcaTemporal;
    private int Dni;
    private int DniAlumno;
    private String RelacionAlumno;
    private String Apellido;
    private String Nombre;
    private String FechaN;
    private String Nacionalidad;
    private String Profesion;
    private String celular;
    private String Email;
    private String Direccion;
    private String Vive_Con_Alumno;

    public Padres(String MarcaTemporal, int Dni, int DniAlumno, String RelacionAlumno, String Apellido, String Nombre, String FechaN, String Nacionalidad, String Profesion, String celular, String Email, String Direccion, String Vive_Con_Alumo) {
        this.MarcaTemporal = MarcaTemporal;
        this.Dni = Dni;
        this.DniAlumno = DniAlumno;
        this.RelacionAlumno = RelacionAlumno;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.FechaN = FechaN;
        this.Nacionalidad = Nacionalidad;
        this.Profesion = Profesion;
        this.celular = celular;
        this.Email = Email;
        this.Direccion = Direccion;
        this.Vive_Con_Alumno = Vive_Con_Alumo;
    }

    public Padres() {
    }

    public String getMarcaTemporal() {
        return MarcaTemporal;
    }

    public void setMarcaTemporal(String MarcaTemporal) {
        this.MarcaTemporal = MarcaTemporal;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public int getDniAlumno() {
        return DniAlumno;
    }

    public void setDniAlumno(int DniAlumno) {
        this.DniAlumno = DniAlumno;
    }

    public String getRelacionAlumno() {
        return RelacionAlumno;
    }

    public void setRelacionAlumno(String RelacionAlumno) {
        this.RelacionAlumno = RelacionAlumno;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFechaN() {
        return FechaN;
    }

    public void setFechaN(String FechaN) {
        this.FechaN = FechaN;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getVive_Con_Alumo() {
        return Vive_Con_Alumno;
    }

    public void setVive_Con_Alumo(String Vive_Con_Alumo) {
        this.Vive_Con_Alumno = Vive_Con_Alumo;
    }
    
    

}
