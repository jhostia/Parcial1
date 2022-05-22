package Modelo;

import java.util.Scanner;

public class CuentasBancarias {
    private int noCuenta;
    private String tipoCuenta;
    private double saldoInicial, saldo;
    private Usuario titular;

    public CuentasBancarias() {
        this.noCuenta = 0;
        this.tipoCuenta = "";
        this.saldoInicial = 0;
        this.saldo = 0;
        this.titular = new Usuario();
    }

    public int getnoCuenta() {
        return noCuenta;
    }

    public void setnoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String gettipoCuenta() {
        return tipoCuenta;
    }

    public void settipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getsaldoInicial() {
        return saldoInicial;
    }

    public void setsaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getsaldo() {
        return saldo;
    }

    public void setsaldo(double saldo) {
        this.saldo = saldo;
    }

    public void crearUsuario(Scanner leer){
        System.out.print("Cedula: "); titular.setcc(leer.nextLine());
        System.out.print("Nombre: "); titular.setnombre(leer.nextLine());
        System.out.print("Apellido: "); titular.setapellido(leer.nextLine());
        System.out.print("Sexo: "); titular.setsexo(leer.nextLine().charAt(0));
    }
    
    public Usuario consultarUsuario(){
        return this.titular;
    }
}