package clases_propias;

/**
 *
 * @author enriq
 */
public class Pareja <T> {
    
    private T primero;
    
    public Pareja () {
        primero = null;
    }
    
    public void setPrimero (T primero) {
        this.primero = primero;
    }
    
    public T getPrimero (){
        return this.primero;
    }
    
    public static void imprimirTrabajador (Pareja <? extends Empleado> p) {
        Empleado primero = p.getPrimero();
        System.out.println (primero);
    }
    
    
}
