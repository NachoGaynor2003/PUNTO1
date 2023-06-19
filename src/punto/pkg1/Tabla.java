/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.pkg1;

/**
 *
 * @public int aModular(int x){
        return x%997;
    }author Ignacio Gaynor
 */
public class Tabla {
    Empleado T[];
    public Tabla(){
        this.T = new Empleado[1000];
    }
    public int aModular(int x){
        return x%997;
        
    }
    public void insertar (Empleado e){
        T[aModular( e.id)] = e;
        
    }
}
