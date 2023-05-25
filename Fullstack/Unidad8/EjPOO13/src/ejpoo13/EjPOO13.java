/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno.
 */
package ejpoo13;

import service.CursoService;

/**
 *
 * @author Facundo
 */
public class EjPOO13 {
    public static void main(String[] args) {
 
        CursoService cs = new CursoService();
        
        System.out.println("Bienvendo al sistema de cursado");
        
        cs.crearCurso();
        
        System.out.println("las ganacias estimadas son de $ " + cs.calcularGanancia());
        
    }
    
}
