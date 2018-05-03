package mx.com.bq.java.examples.e1.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaApp {
    
    public void ordenar() {
        List<String> lista = new ArrayList<String>();
        lista.add("Gato");
        lista.add("Pato");
        lista.add("Conejo");
        lista.add("Loro");
        lista.add("Araña");
        
        /*         
        // Java 1.*
        Collections.sort(lista, new Comparator<String>() {
            //@override
            public int compare(String o1, String o2){
                return o1.compareTo(o2);
            }
        });
        */
        
        // Java 8
        Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));
      
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
    
    public void calcular() {
        /*
        // Java 1.7
        Operacion op = new Operacion() {
            @Override
            public double calcular(double n1, double n2) {
                return (n1+n2) / 2;
            }
        };
        */
        // Java 8
        Operacion op = (double x, double y) -> (x+y) / 2;
        
        System.out.println("Promedio : "+ op.calcular(5, 10));
    }
    
    public static void main(String[] args) {
        LambdaApp app = new LambdaApp();
        //app.ordenar();
        app.calcular();
        
    }
}
