
package ejerciciosclase;

public class InstitucionEducativa {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroDeSedes;
    
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecertipoInstitucion(String n){
        tipoInstitucion = n;
    }
    public void establecerNAlumnos(int n){
        numeroAlumnos = n;
    }
    public void establecerNDocentes(int n){
        numeroDocentes = n;
    }
    public void establecerNSedes(int n){
        numeroDeSedes = n;
    }
    
    public String obteberNombre(){
        return nombre;
    }
    public String obtenertipoInstitucion(){
        return tipoInstitucion;
    }
    public int obtenerNAlumnos(){
        return numeroAlumnos;
    }
    public int obtenerNDocentes(){
        return numeroDocentes;
    }
    public int NSedes(){
        return numeroDeSedes ;
    }
}
