package Vista;

import Modelo.*;
import java.util.Scanner;

public class Vista {

    public static void main(String[] args) {
        Banco bancoNuevo = new Banco();
        Sede sede;
        CuentasBancarias cuenta;

        Scanner leer = new Scanner(System.in);
        int i, opcion = 0, num1 = 0, num2 = 0;

        while (opcion != 6) {
            System.out.println("\n------ MENÚ ------");
            System.out.println("1. Crear banco.");
            System.out.println("2. Crear sede.");
            System.out.println("3. Crear cuenta bancaria.");
            System.out.println("4. Consultar sede.");
            System.out.println("5. Consultar cuenta.");
            System.out.println("6. Salir.");

            System.out.println("\n¿Que opcion desea realizar?");
            opcion = leer.nextInt();

            System.out.println();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    if (bancoNuevo.getnombreBanco().equals("") != true) {
                        System.out.println("Ya existe un banco, cree sedes o cuentas bancarias");
                    } else {
                        System.out.println("Ingrese el nombre del banco: ");
                        bancoNuevo.setnombreBanco(leer.nextLine());
                    }
                    break;

                case 2:
                    if (bancoNuevo.getnombreBanco().equals("")) {
                        System.out.println("No hay un banco existente.");
                    } else {
                        bancoNuevo.crearSede(num1, leer);
                    }
                    break;

                case 3:
                    if (bancoNuevo.getnombreBanco().equals("")) {
                        System.out.println("No existe un banco para crear cuentas.");
                    } else if (bancoNuevo.getnoSedes() == 0) {
                        System.out.println("El banco no tiene sedes. Cree una.");
                    } else {
                        System.out.println("¿En que sede desea inscribir la cuenta?");
                        num2 = leer.nextInt();

                        if (num2 > bancoNuevo.getnoSedes()) {
                            System.out.println("No existe la sede seleccionada.");
                        } else {
                            sede = bancoNuevo.consultarSede(num2 - 1);
                            if (sede.getnoCuentas() == 10) {
                                System.out.println("\nEsta sede ya alcanzó el limite de cuentas.");
                            } else {
                                for (i = 0; i <= sede.getnoCuentas(); i++) {
                                    if (sede.consultarCuenta(i) == null) {
                                        num2 = i;
                                        break;
                                    }
                                }
                                System.out.println();
                                sede.crearCuenta(leer, num2);
                            }
                        }
                    }
                    break;

                case 4:
                    if (bancoNuevo.getnombreBanco().equals("")) {
                        System.out.println("No existe ningun banco para consultar sedes.");
                    } else if (bancoNuevo.getnoSedes() == 0) {
                        System.out.println("No existe ninguna sede abierta.");
                    } else {
                        System.out.println("¿Que sede desea consultar?");
                        num2 = leer.nextInt();

                        if (num2 > bancoNuevo.getnoSedes()) {
                            System.out.println("No existe la sede seleccionada.");
                        } else {
                            sede = bancoNuevo.consultarSede(num2 - 1);
                            System.out.println("\n------- Informacion de la sede --------");
                            System.out.println("Nombre: " + sede.getnombre());
                            System.out.println("Direccion: " + sede.getdireccion());
                            System.out.println("Cuidad: " + sede.getciudad());
                        }
                    }
                    break;

                case 5:
                    if (bancoNuevo.getnombreBanco().equals("")) {
                        System.out.println("No existe un banco para consultar cuentas.");
                    } else if (bancoNuevo.getnoSedes() == 0) {
                        System.out.println("No existe ninguna sede para consultar cuentas.");
                    } else {
                        System.out.println("¿En que sede desea consultar la cuenta?");
                        num2 = leer.nextInt();

                        if (num2 > bancoNuevo.getnoSedes()) {
                            System.out.println("No existe esa sede.");
                        } else {
                            sede = bancoNuevo.consultarSede(num2 - 1);

                            if (sede.getnoCuentas() == 0) {
                                System.out.println("\nSede sin cuentas bancarias inscritas.");
                            } else {
                                System.out.println("¿Que cuenta desea consultar?");
                                num2 = leer.nextInt();

                                if (num2 > sede.getnoCuentas()) {
                                    System.out.println("La cuenta a consultar no existe.");
                                } else {
                                    cuenta = sede.consultarCuenta(num2 - 1);
                                    System.out.println("\n------ Informacion de la cuenta ------");
                                    System.out.println("\nNumero de cuenta: " + cuenta.getnoCuenta());
                                    System.out.println("Tipo de cuenta: " + cuenta.gettipoCuenta());
                                    System.out.println("Saldo inicial: " + cuenta.getsaldoInicial());

                                    Usuario titular = cuenta.consultarUsuario();
                                    System.out.println("\n------ Titular ------");
                                    System.out.println("Titular de la cuenta: " + titular.getnombre() + " " + titular.getapellido());
                                    System.out.println("Cedula]: " + titular.getcc());
                                    System.out.println("Sexo: " + titular.getsexo());
                                }
                            }
                        }
                    }
                    break;

                case 6:
                    System.out.println("Gracias por usar nuestros servicios.\n");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
