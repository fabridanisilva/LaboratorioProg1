/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistroEstudiantes;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class Main {
    public static void main(String[] args) {
        Registro registro = new Registro();
        
        
        Estudiante estudainte2 = new Estudiante("rodri","de paul",50);
        Estudiante estudainte3 = new Estudiante("dibu","martinez",90);
        
        
        //registro.agregarEstudiante(33444555, estudainte2);
        //registro.agregarEstudiante(3322211, estudainte3);
        
        try {
            
            int opcion = 0;
            
            do {                
                Scanner scanner = new Scanner(System.in);
                System.out.println("ingrese 1 si desea agregar un estudiante\n"
                    + "ingrese 2 si desea modificar el promedio de un estudiante\n"
                    + "ingrese 3 si desea eliminar un estudiante\n"
                    + "ingres 4 para mostrar los estudiantes\n"
                    + "ingrese 5 si desea salir");
                
                opcion = scanner.nextInt();
                
                
                switch (opcion) {
                    case 1:
                        scanner.nextLine();
                        System.out.println("ingrese nombre: ");
                        String nombre = scanner.nextLine();
                        
                        System.out.println("ingrese el apellido: ");
                        String apellido = scanner.nextLine();
                        
                        System.out.println("ingrese el promedio: ");
                        double promedio = Double.parseDouble(scanner.next());
                        
                        System.out.println("ingrese el documento: ");
                        double dni = Double.parseDouble(scanner.next());
                        
                        Estudiante estudainte = new Estudiante(nombre,apellido,promedio);
                        
                        registro.agregarEstudiante(dni, estudainte);
                        break;
                        
                     case 2:
                         System.out.println("ingrese el dni del estudiante a modificar el promedio: ");
                         double dni2 = Double.parseDouble(scanner.next());
                         
                         registro.modificarPromedio(dni2);
                         break;
                     case 3:
                         System.out.println("ingrese el dni del estudiante a eliminar el promedio: ");
                         double dni3 = Double.parseDouble(scanner.next());
                         registro.eliminarEstudiante(dni3);
                         break;
                     case 4:
                         registro.mostrarEstudiantes();
                         break;
                     case 5:
                         
                         System.out.println("saliendo...");
                         break;
                    default:
                        System.out.println("opcion invalida");
                }
                
            } while (opcion != 5);
            
        } catch (Exception e) {
            System.out.println("error: " + e);
        }
        
    }
}
