package mx.com.bq.java.examples.e6.streams;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class StreamsApp {
    private List<String> lista;
    private List<String> numeros;
    
    public StreamsApp () {
        lista = new ArrayList<>();
        
        lista.add("Zamora");
        lista.add("Antonio");
        lista.add("Juan");
        lista.add("Ramiro");
        lista.add("Maura");
        lista.add("Hernesto");
        lista.add("Manuel");
        
        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
        numeros.add("4");
        
    }
    
    public void filtrar()  {
        lista.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
    }
     
    public void ordenar() {
        //lista.stream().sorted().forEach(System.out::println);
        lista.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);
    }
    
    public void transformar() {
        //lista.stream().map(String::toUpperCase).forEach(System.out::println);
        
        // JAVA 1.7
        /*
        for (String x : numeros) {
            int num = Integer.parseInt(x) + 1;
            System.out.println("Número : "+ num);
        }
        */
        numeros.stream().map(x -> Integer.parseInt(x) + 1 ).forEach(System.out::println);
    }

    public void limitar() {
        lista.stream().limit(3).forEach(System.out::println);
    }
    
    public void conta() {
        long lg = lista.stream().count();
        System.out.println("Contar : "+ lg);
    }
    
    public static void main(String[] args) {
        StreamsApp app = new StreamsApp();
        //app.filtrar();
        //app.transformar();
        //app.ordenar();
        app.limitar();
        app.conta();
        
    }    
}
