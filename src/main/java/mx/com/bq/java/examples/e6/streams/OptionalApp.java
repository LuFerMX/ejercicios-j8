package mx.com.bq.java.examples.e6.streams;

import java.util.Optional;

public class OptionalApp {
    
    public void probar(String valor) {
//        System.out.println(valor.contains("Luis"));
        
        try {
            Optional op = Optional.empty();
            op.get();
        } catch (Exception e) {
            System.out.println("No hay elemento : "+ e.getMessage());
        }
    }
    
    public void orElse(String valor) {
        Optional<String> op = Optional.ofNullable(valor);
        String x = op.orElse("valor");
        System.out.println("Valor de : "+ x);
    }
    
    public void orElseThrow(String valor) {
        Optional<String> op = Optional.ofNullable(valor);
        op.orElseThrow(NumberFormatException::new);
        
    }
    
    public void isPresent(String valor) {
        Optional<String> op = Optional.ofNullable(valor);
        System.out.println(op.isPresent());
    }
    
    
    public static void main(String[] args) {
        OptionalApp app = new OptionalApp();
        //app.probar(null);
        //app.orElse(null);
        //app.orElseThrow(null);
        app.isPresent(null);
        

    }
}
