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
public class Empleado {
    public int id;
    private String Sueldo;
    private String Nombre;
    private String puesto;
    private String Fecha;

public Empleado(int id, String Nombre, String Salario){
    this.id=id;
this.Nombre=Nombre;
this.Sueldo=Salario;
}

public Empleado(int id, String Nombre, String Salario, String Puesto){
    this.id=id;
    this.Nombre=Nombre;
    this.Sueldo=Salario;
    this.puesto=Puesto;
}

public Empleado(int id, String Nombre,String Salario, String Puesto, String fecha){
    this.id=id;
    this.Nombre=Nombre;
    this.Fecha=fecha;
    this.Sueldo=Salario;
    this.puesto=Puesto;
}

}
