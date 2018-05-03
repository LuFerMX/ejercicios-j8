package mx.com.bq.java.examples.e1.lambda;

public class Sintaxis {
    
    public double probarSintaxis (){
//        Operacion  op = (double x, double y) -> (x+y) / 2;
//        Operacion  op = (double x, double y) -> {return (x+y) / 2};
    /*
        Operacion  op = (double x, double y) -> {
            double a = 2.0;
            System.out.println("Valor de a : " + a);
            return (x+y) / 2 + a;
        };
        */
//      Operacion  op = () -> 2;
    /*
        Operacion  op = () -> {
            int x = 5;
            int y = 2;
            return (x+y) / 2;
        };
        */

        Operacion  op = (x, y) -> (x+y) / 2;
        
        return op.calcular(12, 22);
    }
    
    public static void main(String[] args) {
        Sintaxis st = new Sintaxis();
        System.out.println("El resultado es: " + st.probarSintaxis());
    }
}
