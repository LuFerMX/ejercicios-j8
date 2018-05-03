package mx.com.bq.java.examples.e2.methods;

public interface PersonaB {
    
    default public void hablar() {
        System.out.println("Hola desde Persona B");
    }
}
