package mx.com.bq.java.examples.e10.aorden;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Funciones de Alto Orden 
 */
public class HighApp {
    
    private Function<String, String> convertirMayusculas = x -> x.toUpperCase();
    private Function<String, String> convertirMinusculas = x -> x.toLowerCase();
    
    public void imprimir(Function<String, String> funcion, String valor){
        System.out.println("APPLY: " + funcion.apply(valor));

    }
    
    public Function<String, String> mostrar(String mensaje){
        return (String x) -> mensaje + x;
    }
    
    public void filtrar(List<String> lista, Consumer<String> consumidor, int longitud, String texto ){
        if( null != texto ){
            lista.stream().filter(this.logicaFiltro(texto)).forEach(consumidor);
        } else if(longitud != 0 ) {
            lista.stream().filter(this.logicaFiltro(5)).forEach(consumidor); 
        }
    }
    
    private Predicate<String> logicaFiltro(int longitud){
        return texto -> texto.length() < longitud;
    }
    
    private Predicate<String> logicaFiltro(String cadena){
        return texto -> texto.contains(cadena);
    }
    
    public static void main(String[] args) {
        HighApp app = new HighApp();
        app.imprimir(app.convertirMayusculas, "hola mundo mundial");    
        app.imprimir(app.convertirMinusculas, "BUENOS DÍAS");
        
        System.out.println("MOSTRAR: "+ app.mostrar("Hola ").apply(" Estas aprendiendo algo nuevo =)"));
        
        List<String> lista = new ArrayList<>();
        lista.add("Juan");
        lista.add("Eduardo");
        lista.add("Ramiro");
        lista.add("Pedro");
        lista.add("Edeuterio");
        lista.add("Cornelio Reyna");
        
        System.out.println("\n");
        app.filtrar(lista,System.out::println, 0, "ro");
        System.out.println("\n");
        app.filtrar(lista,System.out::println, 4, null);
        
        
    }
}
