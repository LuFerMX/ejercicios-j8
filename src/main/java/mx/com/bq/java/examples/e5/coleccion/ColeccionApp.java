package mx.com.bq.java.examples.e5.coleccion;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ColeccionApp {
    private List<String> lista;
    
    public void llenarLista () {
        lista = new ArrayList<>();
        
        lista.add("Zamora");
        lista.add("Antonio");
        lista.add("Juan");
        lista.add("Ramiro");
        
    }
    
    public void usarForEach() {
        // JAVA 1.7
        /*
        for (String elemento : lista) {
            System.out.println("Elemento: "+ elemento);
        }
        */
        // JAVA 1.8 Lambda
        //lista.forEach(x -> System.out.println("Elemento: "+ x));
        // JAVA 1.8 Referencias a metodos
        System.out.println("Java 1.8");
        lista.forEach(System.out::println);

    }
    
    public void  usarRemoveIf() {
        // JAVA 1.7
        /*
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            if( it.next().equalsIgnoreCase("Ramiro") ){
                it.remove();
            }            
        }
        */
       // JAVA 1.8 
       lista.removeIf(x -> x.equalsIgnoreCase("Juan"));
    }
    
    public void usarSort() {
        lista.sort((x,y) -> x.compareTo(y) );
    }
    
    public static void main(String[] args) {
        ColeccionApp app = new ColeccionApp();
        app.llenarLista();
        //app.usarRemoveIf();
        app.usarSort();
        app.usarForEach();        
    }
}
