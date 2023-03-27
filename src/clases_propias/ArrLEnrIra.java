/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_propias;
import java.util.*;

/**
 *
 * @author enriq
 */
public class ArrLEnrIra {
    public static <T> String getElementos (T[] a){
        return "El array tiene "+a.length+" elementos";
    }
    public static <T extends Comparable> T getMenor (T[] a){
        if (a == null || a.length == 0){
            return null;
        }
        T elemento_menor = a [0];
        
        for (int i = 1; i < a.length; i++){
            if (elemento_menor.compareTo(a[i]) > 0){
                elemento_menor = a [i];
            }
        }
        return elemento_menor;
    }
    
    public static <T extends Comparable> T getMenor (ArrayList <T> a){
        if (a == null || a.size() == 0){
            return null;
        }
        T elemento_menor = a.get(0);
        
        for (int i = 1; i < a.size(); i++){
            if (elemento_menor.compareTo(a.get(i)) > 0){
                elemento_menor = a.get(i);
            }
        }
        return elemento_menor;
    }    
    
}
