package mx.com.bq.java.examples.e3.finterface;

import mx.com.bq.java.examples.e1.lambda.Operacion;

public class FuncInterApp {
    
    public double operar(double x, double y) {
        Operacion op = (n, n2) -> n + n2;
        return op.calcular(x,y);
    }
    
    public static void main(String[] args) {
        FuncInterApp fi = new FuncInterApp();
        double respuesta = fi.operar(2,3);
        System.out.println("Reultado: "+ respuesta);
    }
}
