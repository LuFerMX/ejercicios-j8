package mx.com.bq.java.examples.se;

import java.util.Set;
import java.util.HashSet;

public class AppSet {
    
    public static void main(String[] args) {
        Set<String> lista = new HashSet<String>();
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("uno");
        lista.add("cuatro");
        
        for (String element : lista ) {
            System.out.println("Elemento : "+ element);
        }
    }
}
