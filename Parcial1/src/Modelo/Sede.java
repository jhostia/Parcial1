package Modelo;

import java.util.Scanner;

public class Sede {
    private String nombre, ciudad, direccion;
    private int noCuenta;
    private CuentasBancarias cuentas[];
    
    public Sede(){
        this.nombre = "";
        this.ciudad = "";
        this.direccion = "";
        this.noCuenta = 0;
        this.cuentas = new CuentasBancarias[10];
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getciudad() {
        return ciudad;
    }

    public void setciudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getnoCuentas() {
        return noCuenta;
    }

    public void crearCuenta(Scanner leer, int pos){
        cuentas[pos] = new CuentasBancarias();
        
        System.out.print("Ingrese # de cuenta: "); cuentas[pos].setnoCuenta(leer.nextInt());
        leer.nextLine();
        System.out.print("Tipo de cuenta: "); cuentas[pos].settipoCuenta(leer.nextLine());
        System.out.print("Saldo inicial: "); cuentas[pos].setsaldoInicial(leer.nextDouble());
        
        System.out.println("\nInformacion del usuario: ");
        leer.nextLine();
        cuentas[pos].crearUsuario(leer);
        
        this.noCuenta++;
    }
    
    public CuentasBancarias consultarCuenta(int pos){
        return this.cuentas[pos];
    }
}
  
    
    