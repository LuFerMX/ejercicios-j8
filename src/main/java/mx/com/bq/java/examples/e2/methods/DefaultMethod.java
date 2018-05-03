package mx.com.bq.java.examples.e2.methods;

public class DefaultMethod implements PersonaA, PersonaB {
    
    @Override
    public void caminar() {
        System.out.println("Caminando ...");
    }
    
    @Override
    public void hablar() {
        PersonaB.super.hablar();
    }
    
    public static void main(String[] args) {
        DefaultMethod dm = new DefaultMethod();
        dm.caminar();
        dm.hablar();
    }
}
