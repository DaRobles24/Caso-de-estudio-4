/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.estudio.pkg3;
import java.util.Arrays;
/**
 *
 * @author danie
 */

class Estudiante {

    private String Nombre;
    private String Curso;
    private String Profesor;
    double Nota;


//Definimos el cosntructor
public Estudiante (String nombre, String curso, String profesor, double nota){
    this.Nombre = nombre;
    this.Curso = curso;
    this.Profesor = profesor;
    this.Nota = nota;
}

//Getters
public String getNombre() {
        return Nombre;
    }

    public String getCurso() {
        return Curso;
    }

    public String getProfesor() {
        return Profesor;
    }

    public double getCalificacion() {
        return Nota;
    }

    // Setters
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setCurso(String curso) {
        this.Nombre = curso;
    }

    public void setProfesor(String profesor) {
        this.Profesor = profesor;
    }

    public void setCalificacion(double calificacion) {
        this.Nota = calificacion;
    }
    
    //Metodo para mostrar info del Estudiante
    @Override
    public String toString(){
        return "Nombre: " + Nombre + "| Curso: " + Curso + "| Profesor: " + Profesor + "| Nota: " + Nota;
        
    }
}

public class CasoEstudio3{
    private Estudiante[] estudiantes = new Estudiante[10];
    private int contador = 0;
    
    //Metodo para agragar Estudiantes
    public void AgregarEstudiante(Estudiante estudiante) {
        if (contador < 10) {
            estudiantes[contador] = estudiante;
            contador++;
        } else {
            System.out.println("No se pueden agregar más estudiantes, el arreglo está lleno.");
        }
    }
    
    
    //Lista General
    public void ListaEstudiantes (){
        for (Estudiante estudiante :estudiantes){
            System.out.println(estudiante);
        }
    }
    
    //nombre de la persona < nota
    public void PersonaMayorNota (){
        if (contador == 0) return;
        
        
       Estudiante mejorestudiante = estudiantes [0];
       for (int i = 1; i < contador; i++) {
            if (estudiantes[i].getCalificacion() > mejorestudiante.getCalificacion()) {
                mejorestudiante = estudiantes[i];
            }
        }
        System.out.println("Estudiante con la mejor nota: " + mejorestudiante);
    }
    
    //nombre de la persona > nota
    public void PersonaMenorNota (){
        if (contador == 0) return;
        
        
       Estudiante mejorestudiante = estudiantes [0];
       for (int i = 1; i < contador; i++) {
            if (estudiantes[i].getCalificacion() < mejorestudiante.getCalificacion()) {
                mejorestudiante = estudiantes[i];
            }
        }
        System.out.println("Estudiante con la peor nota: " + mejorestudiante);
    }
    
   //Promedio de calificaciones
    public void promedioCalificaciones() {
        if (contador == 0) return;

        double suma = 0;
        for (int i = 0; i < contador; i++) {
            suma += estudiantes[i].getCalificacion();
        }
        double promedio = suma / contador;
        System.out.println("Promedio de calificaciones: " + promedio);
    }
    
    // Calificaciones por encima del promedio
    public void calificacionesPorEncimaDelPromedio() {
        if (contador == 0) return;

        double promedio = calcularPromedio();
        System.out.println("Calificaciones por encima del promedio:");
        for (int i = 0; i < contador; i++) {
            if (estudiantes[i].getCalificacion() > promedio) {
                System.out.println(estudiantes[i]);
            }
        }
    }
    
    
    // Calificaciones por debajo del promedio
    public void calificacionesPorDebajoDelPromedio() {
        if (contador == 0) return;

        double promedio = calcularPromedio();
        System.out.println("Calificaciones por debajo del promedio:");
        for (int i = 0; i < contador; i++) {
            if (estudiantes[i].getCalificacion() < promedio) {
                System.out.println(estudiantes[i]);
            }
        }
    }
    
    
    // Método para calcular el promedio
    private double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < contador; i++) {
            suma += estudiantes[i].getCalificacion();
        }
        return suma / contador;
    }
    
      public static void main(String[] args) {
          CasoEstudio3 escuela = new CasoEstudio3 (); 
          escuela.AgregarEstudiante(new Estudiante ("Daniel", "Calculo 1", "SR.Lopez", 88.33));
          escuela.AgregarEstudiante(new Estudiante ("Juan", "Espanol", "SR.Gonzales", 78.33));
          escuela.AgregarEstudiante(new Estudiante ("Maria", "Matematica", "SR.Aguilar", 68.33));
          escuela.AgregarEstudiante(new Estudiante ("Kiara", "Ingles", "SR.Robles", 98.33));
          escuela.AgregarEstudiante(new Estudiante ("Manuel", "Sociales", "SR.Lopez", 100));
          escuela.AgregarEstudiante(new Estudiante ("Luis", "Ingles", "SR.Robles", 23.33));
          escuela.AgregarEstudiante(new Estudiante ("Maria", "Matematicas", "SR.Aguilar", 80.33));
          escuela.AgregarEstudiante(new Estudiante ("Diana", "Ingles", "SR.Robles", 81.33));
          escuela.AgregarEstudiante(new Estudiante ("Lucia", "Espanol", "SR.Gonzales", 18.33));
          escuela.AgregarEstudiante(new Estudiante ("Daniela", "Espanol", "SR.Gonzales", 8.33));
          
          
        escuela.ListaEstudiantes();
        escuela.PersonaMayorNota();
        escuela.PersonaMenorNota();
        escuela.promedioCalificaciones();
        escuela.calificacionesPorEncimaDelPromedio();
        escuela.calificacionesPorDebajoDelPromedio();
      }
}
 
