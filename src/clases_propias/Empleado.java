/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_propias;

public class Empleado {
    private String nombre;
    private int edad,salario;
    public Empleado (String nombre, int edad, int salario){
        this.edad = edad;
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + '}';
    }
    
}
