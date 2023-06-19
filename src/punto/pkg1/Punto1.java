/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.pkg1;

/**
 *
 * @author Ignacio Gaynor
 */
public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado primerTrabajador, segundoTrabajador, tercerTrabajador;
        primerTrabajador = new Empleado(245643,"FRANCISCO","75.000");
        segundoTrabajador = new Empleado(245981,"LUCIANA","100.000", "CEO");
        tercerTrabajador = new Empleado (257135,"SANTIAGO","50.000", "INGENIERO","20-05-2003");
        Tabla posicion;
        posicion=new Tabla();
        int alfa1= posicion.aModular(primerTrabajador.id);
        int alfa2=posicion.aModular(segundoTrabajador.id);
        int alfa3=posicion.aModular(tercerTrabajador.id);
        posicion.insertar(primerTrabajador);
        posicion.insertar(segundoTrabajador);
        posicion.insertar(tercerTrabajador);
        System.out.println("El resultado de aModular es" + alfa1 );
       System.out.println("El resultado de aModular es" + alfa2 );
        System.out.println("El resultado de aModular es" + alfa3 );
    }
    
}
