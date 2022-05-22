package Modelo;

import java.util.Scanner;

public class Banco {
    //Atributos
    private String nombreBanco;
    private int noSedes;
    private Sede sedes[];
    
    Scanner leer = new Scanner(System.in);
    
    public Banco(){
    this.nombreBanco = "";
    this.noSedes = 0;
    this.sedes = new Sede[20];
    }

    public String getnombreBanco() {
        return nombreBanco;
    }

    public void setnombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public int getnoSedes() {
        return noSedes;
    }

    public void setnoSedes(int noSedes) {
        this.noSedes = noSedes;
    }
    
    public void crearSede(int pos, Scanner leer){
        sedes[pos] = new Sede();
        
        System.out.print("Ingrese el nombre de la sede: ");
        sedes[pos].setnombre(leer.nextLine());
        System.out.print("Ingrese ciudad: ");
        sedes[pos].setciudad(leer.nextLine());
        System.out.print("Ingrese direccion: ");
        sedes[pos].setdireccion(leer.nextLine());
        
        this.noSedes++;
    }
    
    public Sede consultarSede(int pos){
        return sedes[pos];
    }
}