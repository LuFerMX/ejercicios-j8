package mx.com.bq.java.examples.e7.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapApp {
    
    private Map<Integer, String> map;
    
    public void poblar() {
        
        map = new HashMap<>();
        map.put(1, "Juan");
        map.put(2, "Rodrigo");
        map.put(3, "Zamano");
        map.put(4, "Alberto");
        map.put(5, "Pablo");
        
    }
    
    public void imprimir_v7() {
        for (Entry <Integer, String> e : map.entrySet()) {
            System.out.println("Key : "+ e.getKey() + " Valor: "+ e.getValue());
        }
    }
    
    public void imprimir_v8() {
        // map.forEach((k,v) -> System.out.println("K : "+ k + " V: "+ v ) );
        
        map.entrySet().stream().forEach(System.out::println);
    }
    
    public void recoleactar(){
        Map<Integer, String> recolectado = map.entrySet().stream()
            .filter(e->e.getValue().contains("J"))
            .collect(Collectors.toMap(p -> p.getKey(), p-> p.getValue()));
        
        recolectado.entrySet().stream().forEach(System.out::println);
    }
    
    public void insertarSiAusente() {
        map.putIfAbsent(6, "Jaime");
        
    }

    public void operarSiPresente() {
        map.computeIfPresent(3, (k,v) -> k+v );
        System.out.println(map.get(3));
    }
    
    public void obtenerOrPredeterminado() {
        String valor = map.getOrDefault(6, "Valor Default");
        System.out.println(valor);
    }
    
    public static void main(String[] args) {
        MapApp app = new MapApp();
        app.poblar();
        //app.imprimir_v7();
        app.insertarSiAusente();
        //app.imprimir_v8();
        //app.operarSiPresente();
        //app.obtenerOrPredeterminado();
        app.recoleactar();
    }
}
