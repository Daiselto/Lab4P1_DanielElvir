/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_danielelvir;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Lab4P1_DanielElvir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner read = new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            System.out.println("1. Conjuntos");
            System.out.println("2. Contraseña mejorada");
            System.out.println("3. Para Salir");
            System.out.println("Ingrese una opción");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1: {
                     Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        
        String conjuntoA, conjuntoB;
        boolean iguales = true;
        String union = "";
        String interseccion = "";
        int indice;
        
        System.out.println("Ingrese el primer conjunto: ");
        conjuntoA = scanner.nextLine();
        System.out.println("Ingrese el segundo conjunto: ");
        conjuntoB = scanner2.nextLine();
        
        for (int i = 0; i < conjuntoA.length(); i++) {
            char caracterA = conjuntoA.charAt(i);
            boolean encontrado = false;
            for (int j = 0; j < union.length(); j++) {
                if (union.charAt(j) == caracterA) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                union += caracterA;
            }
            encontrado = false;
            indice = -1;
            for (int j = 0; j < conjuntoB.length(); j++) {
                if (conjuntoB.charAt(j) == caracterA) {
                    encontrado = true;
                    indice = j;
                    break;
                }
            }
            if (encontrado) {
                if (!interseccion.contains("" + caracterA)) {
                    interseccion += caracterA;
                }
            }
            else {
                iguales = false;
            }
        }
        
        for (int i = 0; i < conjuntoB.length(); i++) {
            char caracterB = conjuntoB.charAt(i);
            boolean encontrado = false;
            for (int j = 0; j < union.length(); j++) {
                if (union.charAt(j) == caracterB) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                union += caracterB;
            }
            encontrado = false;
            indice = -1;
            for (int j = 0; j < conjuntoA.length(); j++) {
                if (conjuntoA.charAt(j) == caracterB) {
                    encontrado = true;
                    indice = j;
                    break;
                }
            }
            if (!encontrado) {
                iguales = false;
            }
        }
        
        if (iguales) {
            System.out.println("Ambos conjuntos son iguales");
        }
        else {
            System.out.println("Ambos conjuntos no son iguales");
        }
        
        System.out.println("Unión: " + union);
        System.out.println("Intersección: " + interseccion);
       
      break;  
    }
                case 2:{
                    System.out.println("Ingrese la contraseña");
                    String contra = leer.next();

                    boolean hayletra = false;
                    boolean haynum = false;
                    boolean segura = true;
                    if (contra.length() >= 8) {
                        for (int i = 0; i < contra.length(); i++) {
                            char c = contra.charAt(i);
                            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                                hayletra = true;
                            } else if (c >= '0' && c <= '9') {
                                haynum = true;
                            }
                        }
                        if (!hayletra) {
                            segura = false;
                            System.out.println("La contraseña no es segura porque no tiene letra");
                        } 
                        if (!haynum) {
                            System.out.println("La contraseña no es segura porque no tiene numero");
                            segura = false;
                        } 
                    } else {
                        segura = false;
                        System.out.println("La contraseña no es segura porque tiene menos de 8 caracteres");
                    }

                    if (segura) {
                        System.out.println("Ingrese un número: ");
                        int num = leer.nextInt();

                        String nuevacontra = "";
                        int contador = 0;
                        for (int i = 0; i < contra.length(); i++) {
                            char c = contra.charAt(i);
                            nuevacontra += c;
                            contador++;
                            if (contador % 2 == 0) {
                                nuevacontra += num;
                                num++;
                            }
                        }

                        System.out.println("La contraseña es segura");
                        System.out.println("La nueva contraseña es: " + nuevacontra);

                    }
                    break;
                }
                case 3: {
                    System.out.println("Gracias por usar el programa");
                    seguir = false;
                }
            }
        }
    }
}

        // TODO code application logic here
    
