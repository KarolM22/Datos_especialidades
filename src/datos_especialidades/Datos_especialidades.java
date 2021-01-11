/*
 * 12.	Leer los siguientes datos de los alumnos de una escuela:
Número de control, Nivel, Especialidad. Calcular lo siguiente:

a)	Cuántos alumnos son de bachillerato
b)	Cuántos alumnos son de profesional
c)	Cuántos alumnos son de maestría
d)	Cuántos alumnos son de sistemas

 */
package datos_especialidades;

import java.util.Scanner;

/**
 *
 * Karol Martinez Cuellar 
 */
public class Datos_especialidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        String especialidad; 
        int  nivel, bachillerato=0, profesional=0, maestria=0, sistema=0, nestudiantes; 
        
        System.out.println("INGRESE EL NUMERO DE ALUMNOS A REGISTRAR");
        nestudiantes= leer.nextInt();
        Integer ncontrol; // integer es una variable no primitiva, int mas grande
        
        for (int c=1;c<=nestudiantes;c++){
            
             System.out.println("DIGITE EL NUMERO DE CONTROL ");
                ncontrol= leer.nextInt();
                System.out.println("NIVEL");
                nivel=leer.nextInt();
        
            System.out.println("A QUE ESPECIALIDAD PERTENECE");
            especialidad= leer.next();
            if ( ("bachillerato".equals(especialidad) ) || ( ("BACHILLERATO".equals(especialidad)))) {
               bachillerato++;
            } else {
                if(("profesional".equals(especialidad) ) || ( ("PROFESIONAL".equals(especialidad)))){
                profesional++;
                }else{if(("maestria".equals(especialidad) ) || ( ("MAESTRIA".equals(especialidad)))){
                maestria++;
                }else {if(("sistema".equals(especialidad) ) || ( ("SISTEMA".equals(especialidad)))){
                sistema++;
                }}}
                    
                    
                    } 
            
            
        
        }
        System.out.println("---------------------------------------------");
        System.out.println("NUMERO DE ALUMNOS DE BALLILLER ES DE : "+bachillerato);
        System.out.println("NUMERO DE ALUMNOS DE SISTEMA ES DE : "+sistema);
        System.out.println("NUMERO DE ALUMNOS DE MAESTRIA ES DE : "+maestria);
        System.out.println("NUMERO DE ALUMNOS DE PROFESIONAL ES DE : "+profesional);
        
        
    }
    
}
