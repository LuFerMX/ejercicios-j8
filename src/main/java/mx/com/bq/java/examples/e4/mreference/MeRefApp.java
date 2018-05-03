package mx.com.bq.java.examples.e4.mreference;

import java.util.Arrays;
import java.util.Comparator;

import mx.com.bq.java.examples.e1.lambda.Operacion;

public class MeRefApp {
    
    public static void referenciarMetodoStatic() {
        System.out.println("Metodo referido static");
    }
    
    public void referenciarMetodoInstanciaObjetoArbitrario() {
        String[] nombres = {"Juan", "Fernando", "Arturo", "Zamora"};
        
        /*
        // JAVA 1.7 
        Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
         */
        // JAVA 1.8 LAMBDA
        //Arrays.sort(nombres, (s1,s2) -> s1.compareToIgnoreCase(s2));
        // JAVA 1.8 REFERENCIA A METODO
        Arrays.sort(nombres, String::compareToIgnoreCase);
        
        System.out.println("Nombres : "+ Arrays.toString(nombres));
    }
    
    public void referenciarMetodoInstanciaObjetoParticular() {
        System.out.println("Método Referido Instancia de Objeto en particular");
    }
    
    public void referenciarConstructor() {
        // JAVA  1.7
        /*
        IPersona ipr = new IPersona() {
            
            @Override
            public Persona crear(int id,pr  String nombre) {
                return new Persona(id, nombre);
            }
        };
        */
        // JAVA 1.8 LAMBDA
        //IPersona ipr = (x, y) -> (new Persona(x, y));
        // JAVA 1.8 REFERENCIA A METODO
        IPersona ipr = Persona::new;
        
        Persona  p = ipr.crear(1, "Juan Camaney 3 ");
        System.out.println(p);
    }
    
    public void operar () {    
//        MOperacion op = () -> MeRefApp.referenciarMetodoStatic();
        MOperacion op = MeRefApp::referenciarMetodoStatic;
        
        op.saludar();
    }
    
    public static void main(String[] args) {
        MeRefApp app = new MeRefApp();
//        app.operar();

//        app.referenciarMetodoInstanciaObjetoArbitrario();

//        MOperacion op = app::referenciarMetodoInstanciaObjetoParticular;
//        op.saludar();
        
        app.referenciarConstructor();
    }
}
