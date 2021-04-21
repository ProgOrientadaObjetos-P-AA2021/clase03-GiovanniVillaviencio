
package Paquete2;
import ejerciciosclase.InstitucionEducativa;
public class Principal {
    public static void main(String[] args) {
        InstitucionEducativa iE = new InstitucionEducativa();
        iE.establecerNAlumnos(100);
        iE.establecerNDocentes(15);
        iE.establecerNSedes(2);
        iE.establecerNombre("Daniel Alvarez Burneo");
        iE.establecertipoInstitucion("Fiscomisional");
        System.out.printf("%s - %s - %d - %d - %d\n",iE.obteberNombre()
                ,iE.obtenertipoInstitucion(),iE.obtenerNAlumnos(),iE.obtenerNDocentes()
                ,iE.obtenerNDocentes());
    } 
}
