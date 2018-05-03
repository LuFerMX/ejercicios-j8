package mx.com.bq.java.examples.e6.streams;

import java.util.List;
import java.util.ArrayList;

public class ParallelStream {
    
    private List<Integer> numeros;
    
    public void llenar() {
        numeros = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }
    }
    
    public void probarStream() {
        numeros.stream().forEach(System.out::println);
    }
    
    public void probarParlelo() {
        numeros.parallelStream().forEach(System.out::println);
        
    }
    
    public static void main(String[] args) {
        ParallelStream app = new ParallelStream();
        app.llenar();
        // app.probarStream();
        app.probarParlelo();
    }
}
