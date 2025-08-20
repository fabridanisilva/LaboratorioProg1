/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistroEstudiantes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class Registro {
    HashMap<Double,Estudiante> registro = new HashMap<>();
    
    public void agregarEstudiante(double valor,Estudiante estudiante){
        registro.put(valor, estudiante);
    }
    
    public void modificarPromedio(double dni){
        Scanner scanner = new Scanner(System.in);
        boolean seEncuentra = true;
        for (Map.Entry<Double, Estudiante> entry : registro.entrySet()) {
            Double key = entry.getKey();
            Estudiante val = entry.getValue();
            
            if (key == dni) {
                System.out.println("ingrese el nuevo promedio de " +val.nombre + " " + val.apellido +  ": ");
                double nuevoPromedio = scanner.nextDouble();
                val.promedio = nuevoPromedio;
                System.out.println("se modifico el promedio del estudiante.");
            }else{seEncuentra = false;}
            
        }
        if (!seEncuentra) {
                System.out.println("no se encuentra ese dni: " + dni);
         }
        
    }
    
    public void eliminarEstudiante(double dni){
        
        registro.remove(dni);
        System.out.println("se borro el estudiante.");
    
    }
    
    public void mostrarEstudiantes(){
        for (Map.Entry<Double, Estudiante> entry : registro.entrySet()) {
            Double key = entry.getKey();
            Estudiante val = entry.getValue();
            System.out.println("documento: " +key +  " Estudiante:  " + val);
        }
    
    }
}
