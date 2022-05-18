package Modelo;

public class CuentasBancarias {
    int NoCuenta;
    String tipoCuenta;
    double saldoInicial;
    double saldo;

    public CuentasBancarias(int NoCuenta, String tipoCuenta, double saldoInicial, double saldo) {
        this.NoCuenta = NoCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldoInicial = saldoInicial;
        this.saldo = saldo;
    }

    public int getNoCuenta() {
        return NoCuenta;
    }

    public void setNoCuenta(int NoCuenta) {
        this.NoCuenta = NoCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
