package domain;



public class Alumnos {
    private String Marca_Temporal;
    private int DNI;
    private String apellido;
    private String nombre;
    private String fecha_N;
    private int edad;
    private String direccion;
    private String piso_Depto;
    private String localidad;
    private String correo;
    private String celular;
    private String curso;
    private String division;

    public Alumnos(String Marca_Temporal, int DNI, String apellido, String nombre, String fecha_N, int edad, String direccion, String piso_Depto, String localidad, String correo, String celular, String curso, String division) {
        this.Marca_Temporal = Marca_Temporal;
        this.DNI = DNI;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fecha_N = fecha_N;
        this.edad = edad;
        this.direccion = direccion;
        this.piso_Depto = piso_Depto;
        this.localidad = localidad;
        this.correo = correo;
        this.celular = celular;
        this.curso = curso;
        this.division = division;
    }


    
    
    
    public Alumnos() {
    }
    
    
    public String getMarca_Temporal() {
        return Marca_Temporal;
    }

    public void setMarca_Temporal(String Marca_Temporal) {
        this.Marca_Temporal = Marca_Temporal;
    }
    
    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_N() {
        return fecha_N;
    }

    public void setFecha_N(String fecha_N) {
        this.fecha_N = fecha_N;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPiso_Depto() {
        return piso_Depto;
    }

    public void setPiso_Depto(String piso_Depto) {
        this.piso_Depto = piso_Depto;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }



    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
    
    
    
}
