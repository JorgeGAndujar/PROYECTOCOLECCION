
package misrc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Principal {

    public static void main(String[] args) {
      ejemplo1();
    }
    //CREAR UNA COLECCIÓN TREESET
    public static void ejemplo1() {
        //FILTRAR QUEDANDO CON LOS DISTINTOS(NO DUPLICADOS
        //ORDENA POR NUMERO 
    
        Set<Integer> enteros_ts = new TreeSet<>();
        enteros_ts.add(1);
        enteros_ts.add(3);
        enteros_ts.add(2);
        enteros_ts.add(1);
        for (Integer elemento : enteros_ts) {//recorrer por elementos y filtra los repetidos
            System.out.print(elemento + " ");
        }
        for(int i = 0; i<enteros_ts.size(); i++){
            //System.out.print(enteros_ts.get(i)); NO SE PUEDE RECORRER POR INDICE
        }
        //CONVERTIR UN TREEST A ARRAYLIST
        List<Integer> enteros_al = new ArrayList<>(enteros_ts);
        //RECORRER POR ELEMENTO EL ARRAYLIST
        for(Integer elemento: enteros_al){
            System.out.print(elemento + " ");
        }
        //RECORRER POR INDICE EL ARRAYLIST
         for(int i = 0; i<enteros_al.size(); i++){
            System.out.print(enteros_al.get(i)+ " ");
        }
    }
}    
