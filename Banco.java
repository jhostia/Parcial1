package Modelo;

import java.util.Scanner;

public class Banco {
    //Atributos
    String nombreB;
    int NoSedes = 0;
    
    String nombreSede, direccion, ciudad;
    int noCuentas, codigo;
    
    Scanner leer = new Scanner(System.in);

    public Banco() {
    }

    public Banco(String nombreB, int NoSedes) {
        this.nombreB = nombreB;
        this.NoSedes = NoSedes;
    }

    public String getNombre() {
        return nombreB;
    }

    public void setNombre(String nombre) {
        this.nombreB = nombre;
        System.out.println("Nombre del banco: "); 
        nombreB = leer.nextLine();
    }

    public int getNoSedes() {
        return NoSedes;
    }

    public void setNoSedes(int NoSedes) {
        this.NoSedes = NoSedes;
    }
    
    public void crearSede(){
        System.out.println("------ Creacion de Sede ------");
        System.out.println("Ingrese nombre: "); nombreSede = leer.nextLine();
        System.out.println("Ingrese direccion: "); direccion = leer.nextLine();
        System.out.println("Ciudad: "); ciudad = leer.nextLine();
        noCuentas = 10;
        System.out.println("Codigo: "); codigo = leer.nextInt();
        NoSedes += 1;
    }
}
