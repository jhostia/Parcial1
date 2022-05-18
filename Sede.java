package Modelo;

import java.util.Scanner;

public class Sede {
    public String nombreS;
    String direccion;
    String ciudad;
    int NoCuentas;
    int codigo;
    
    Scanner leer = new Scanner(System.in);
    int NoCuenta;
    String tipoCuenta;
    double saldoInicial;
    double saldo;

    public Sede(String nombre, String direccion, String ciudad, int NoCuentas, int codigo) {
        this.nombreS = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.NoCuentas = NoCuentas;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombreS;
    }

    public void setNombre(String nombre) {
        this.nombreS = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNoCuentas() {
        return NoCuentas;
    }

    public void setNoCuentas(int NoCuentas) {
        this.NoCuentas = NoCuentas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void CrearCuenta(){
        System.out.println("No Cuenta: "); 
        NoCuenta = leer.nextInt();
        System.out.println("Tipo de cuenta [Corriente o Ahorros]: ");
        tipoCuenta = leer.nextLine();
        System.out.println("Saldo inicial: ");
        saldoInicial = leer.nextDouble();
    }
}
