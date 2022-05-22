package Modelo;

public class Usuario {
    private String cc, nombre, apellido;
    private char sexo;

    public Usuario() {
        this.cc = "";
        this.nombre = "";
        this.apellido = "";
        this.sexo = 'N';
    }

    public String getcc() {
        return cc;
    }

    public void setcc(String cc) {
        this.cc = cc;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getapellido() {
        return apellido;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public char getsexo() {
        return sexo;
    }

    public void setsexo(char sexo) {
        this.sexo = sexo;
    }
}