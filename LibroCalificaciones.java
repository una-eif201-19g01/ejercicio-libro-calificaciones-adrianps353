/*
 * =====================================================================================
 *
 *       Filename:  LibroCalificaciones.h
 *
 *    Description:  Encabezado de la clase Libro Calificaciones
 *
 *        Created:  2019-08-05
 *
 *         Author:  Maikol Guzman Alan mikeguzman@gmail.com
 *   Organization:  Universidad Nacional de Costa Rica
 *
 * =====================================================================================
 */
public class LibroCalificaciones {

    public String nombreCurso;
    public int nota;

    LibroCalificaciones(){ // Constructor por  defecto
        nombreCurso = null;
        nota = 0;
    }

    //
    LibroCalificaciones(int nota, String nombreCurso){ // Constructor con parámetros
        this.nombreCurso = nombreCurso;
        this.nota = nota;
    }

    public void obtenerMensaje(){ // Imprime los datos del curso 
        System.out.println("El curso "+nombreCurso+" con la nota "+nota+" pertenece al rango "+this.obtenerRangoLetra());
    }

    public void setNota(int nota){
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNombreCurso(String nombreCurso){
        this.nombreCurso = nombreCurso;
    }

    public int getNombreCurso() {
        return nota;
    }

    private String obtenerRangoLetra() { // Retorna el rango en el que se encuentra la nota del curso.
        if (nota < 60) {
            return "F";
        } else if (nota >= 60 && nota < 70) {
            return "D";
        } else if (nota >= 70 && nota < 80) {
            return "C";
        } else if (nota >= 80 && nota < 90) {
            return "B";
        } else if (nota >= 90 && nota < 100) {
            return "A";
        }
        else return "Error: la nota está fuera de rango.";
    }

    public String toString(){
        return nombreCurso+", "+nota;
    }
  
}
