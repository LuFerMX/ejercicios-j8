package mx.com.bq.java.examples.e8.repeticion;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AnotacionesApp {
    
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Lenguajes {
        Lenguaje[] value() default {};
    }
    
    @Repeatable(value = Lenguajes.class)
    public @interface Lenguaje{
        String value();
    }
    
    // JAVA 1.7
    /*
    @Lenguajes({
        @Lenguaje("Java"),
        @Lenguaje("Python"),
        @Lenguaje("Javascript")
    })
    */
    // JAVA 1.8
    @Lenguaje("Java")
    @Lenguaje("Python")
    @Lenguaje("Javascript")
    public interface LenguajeProgramacion{
        
    }
    
    public static void main(String[] args) {
        Lenguaje[] lenguajeArray = LenguajeProgramacion.class.getAnnotationsByType(Lenguaje.class);
        System.out.println("Se tienen "+ lenguajeArray.length +" anotaciones en Lenguaje[]" );
        
        Lenguajes len = LenguajeProgramacion.class.getAnnotation(Lenguajes.class);
        for( Lenguaje elem : len.value() ){
            System.out.println("Elemento : "+ elem.value());
        }
        
        
    }
}
