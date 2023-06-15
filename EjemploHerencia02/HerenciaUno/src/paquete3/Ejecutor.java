/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Creación de un objeto de tipo EstudianteDistancia
        
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        
        EstudianteDistancia estDistancia = new EstudianteDistancia(nombre, 
                apellido, identificacion, edad);
        
        System.out.println(estDistancia);
                
        // Crear un objeto de tipo Estudiante Presencial
        
        EstudiantePresencial ePresencial = new EstudiantePresencial("Pipe", 
                "Morales", "1105708745", 2);
        
        System.out.println(ePresencial);
    }
}
