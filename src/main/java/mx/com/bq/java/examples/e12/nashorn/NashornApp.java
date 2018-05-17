package mx.com.bq.java.examples.e12.nashorn;

import java.io.File;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashornApp {
    
    private ScriptEngineManager m;
    private ScriptEngine e;
    private Invocable invocador;
    
    public NashornApp(){
        m = new ScriptEngineManager();
        e = m.getEngineByName("nashorn");
        invocador = (Invocable)e;
    }
    
    public void llamarFunciones() throws Exception{
        e.eval("print('JS desde Java')");
        //File f = new File("test.txt");
        //f.createNewFile();
        e.eval(new FileReader("mx/com/bq/java/examples/e12/nashorn/archivo.js"));
        
        String respuesta = (String) invocador.invokeFunction("calcular", "22", "55");
        System.out.println("Respuesta javascript: "+ respuesta);
        
        double respuesta2 = (double) invocador.invokeFunction("calcular", 22, 55);
        System.out.println("Respuesta javascript: "+ respuesta2);
    }
    
    public void implementarInterfaz() throws Exception{
        e.eval(new FileReader("mx/com/bq/java/examples/e12/nashorn/archivo.js"));
        
        Object implementacion = e.get("hiloImplements");
        Runnable rn = invocador.getInterface(implementacion, Runnable.class);
        
        Thread h1 = new Thread(rn);
        h1.start();
        
        Thread h2 = new Thread(rn);
        h2.start();
        
        Thread h3 = new Thread(rn);
        h3.start();
    }

    public static void main(String[] args) throws Exception {
        NashornApp app = new NashornApp();
        //app.llamarFunciones();
        app.implementarInterfaz();
    }
}
