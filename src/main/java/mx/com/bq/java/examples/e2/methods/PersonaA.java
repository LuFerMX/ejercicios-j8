package mx.com.bq.java.examples.e2.methods;

public interface PersonaA {
    
    public void caminar();
    
    default public void hablar() {
        System.out.println("Hola Bienvenidos...");
    }

}
