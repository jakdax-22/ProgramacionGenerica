
package clases_propias;

/**
 *
 * @author enriq
 */
public class HerenciaGenericos {
    public static void main(String[] args) {
       /* Empleado Administrativa = new Empleado ("Elena",45,1600);
        Jefe DirectoraComercial = new Jefe ("Ana",27,3500);
        Empleado nuevoEmpleado = DirectoraComercial;*/
       
       Pareja <Empleado> Administrativa = new Pareja <Empleado>();
       Pareja <Jefe> DirectoraComercial = new Pareja <Jefe> ();
      //Pareja<Empleado> nuevoEmpleado = DirectoraComercial;
      Pareja.imprimirTrabajador(DirectoraComercial);
    }    
}
